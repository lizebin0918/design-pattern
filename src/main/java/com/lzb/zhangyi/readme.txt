话单转换过程
* 读出源话单文本文件的内容
* 根据话单标准以及接口表进行转换
* 将转换后的话单写入到目标话单文本文件中

# 第一版的设计有点烂，CdrTxtService只能通过方法别名，不能采用重载
# 第二版的设计，CdrTxtService由ICdrConverter组成，外部决定对应的转换器
# 第三版扩展需求，读取数据的来源，可能是文本文件、数据表、xml文件
# 第四版扩展需求：com.lzb.zhangyi.v2.CUToCMConverter.fromString(String)方法，只接收字符串，但是如果是xml格式的，我要传XmlNode才可以
* 最直接的做法在ICdrConverter添加4个方法：fromXmlNode(XmlNode)、fromDataRow(DataRow)。
	* 是否可以直接用泛型？好像也行。这里有个类爆炸的问题，比如：CMToCuConverter，一种转换逻辑，但是需要4种方式，我就要新建：CMToCuConverter<String>,CMToCuConverter<XmlNode>，这种多维度组合，用泛型比较僵硬
	* 作者准备用什么方式？桥接模式。我们应该另辟蹊径。如果将转换算法与数据源读写都看作是一种话单转换的话,情形就不一样了。由于数据源的读写与实际的话单格式无关,可以将其看作是话单转换的抽象,而话单间的转换算法就是话单转换的实现"将抽象化(Abstraction)与实现化(Implementation)解耦,使得二者可以独立地变化。"这正是引入桥接 (Bridge)模式的目的所在。
	* 从前面的的描述可知,CdrHandler仅对话单数据源负责,对话单的格式是无知的为;反过来,ICdrConverter只关心话单格式,却并不负责各种话单数据源白的处理。我们需要找到一个突破点,使得CdrHandler的Read()和Writte()方法能够与ICdrConverter的Convert()方法无缝地连接起来。试想,下面面的实现可行吗?
	* 最后作者的桥接模式有点翻车，强行使用桥接模式，感觉套不上
# 最后在抽象类的构造函数里面引入了抽象工厂对象，这样封装参数好像也挺好
public abstract class CdrHandler
{
	protected IList<CdrRecord> m_records = ...
	protected ICdrConverter m_converter;
	protected CdrConfigReader m_reader;

	public CdrHandler(CdrFactory factory) {
		m_converter = factory.CreateCdrConverter();
		m_reader = factory.CreateCdrConfigReader();
	}

	//源数据源
	public string Source
	{ get; set;
	//目标数据源
	public string Destination
	{ get; set;}
}
