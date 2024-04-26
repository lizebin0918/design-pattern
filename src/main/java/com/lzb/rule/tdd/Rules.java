package com.lzb.rule.tdd;

import java.util.Optional;
import java.util.stream.Stream;

public final class Rules {
    public static Rule defaultRule() {
        return x -> Optional.of(String.valueOf(x));
    }
    public static Rule anyOf(Rule... rules) {
        return x -> Stream.of(rules)
                .map(rule -> rule.apply(x))
                .filter(Optional::isPresent)
                .map(Optional::get).findAny();
    }
    public static Rule allOf(Rule... rules) {
        StringBuilder result = new StringBuilder();
        return x -> {
            boolean match = Stream.of(rules)
                    .map(rule -> rule.apply(x))
                    .allMatch(resultOpt -> {
                        if (resultOpt.isPresent()) {
                            result.append(resultOpt.get());
                            return true;
                        }
                        return false;
                    });
            return match ? Optional.of(result.toString()) : Optional.empty();
        };
    }
    private Rules() {}
}