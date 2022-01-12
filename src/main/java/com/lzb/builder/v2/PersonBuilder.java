package com.lzb.builder.v2;

import com.lzb.builder.v1.Person;

public class PersonBuilder implements StepFirstnameBuilder,
        StepLastnamePersonBuilder,
        StepEmailPersonBuilder,
        FinalStepPersonBuilder {
    private final Person person;

    private PersonBuilder() {
        person = new Person();
    }

    public static StepFirstnameBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public StepLastnamePersonBuilder withFirstname(String firstname) {
        person.setFirstname(firstname);
        return this;
    }

    @Override
    public StepEmailPersonBuilder withLastname(String lastname) {
        person.setLastname(lastname);
        return this;
    }

    @Override
    public FinalStepPersonBuilder withEmail(String email) {
        person.setEmail(email);
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}