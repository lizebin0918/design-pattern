package com.lzb.builder.v1;

import lombok.Data;

/**
 * @author lizebin
 */
@Data
public class Person {

    private String firstname;
    private String lastname;
    private String nickname;
    private String email;

    public static class Builder {
        private final Person person;

        private Builder() {
            person = new Person();
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder withFirstname(String firstname) {
            person.firstname = firstname;
            return this;
        }

        public Builder withLastname(String lastname) {
            person.lastname = lastname;
            return this;
        }

        public Builder withNickName(String nickName) {
            person.nickname = nickName;
            return this;
        }

        public Builder withEmail(String email) {
            person.email = email;
            return this;
        }

        public Person build() {
            return person;
        }
    }

}