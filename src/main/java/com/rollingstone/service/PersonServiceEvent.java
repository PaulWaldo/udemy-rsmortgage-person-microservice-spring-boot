package com.rollingstone.service;

import org.springframework.context.ApplicationEvent;

import com.rollingstone.domain.Person;

/**
 * This is an optional class used in publishing application events. This can be
 * used to inject events into the Spring Boot audit management endpoint.
 */

public class PersonServiceEvent extends ApplicationEvent {
	private static final long serialVersionUID = -6121624308782503383L;
	
	Person eventPerson;
	String eventType;

	public PersonServiceEvent(Object source, String eventType, Person eventPerson) {
		super(source);
		this.eventType = eventType;
		this.eventPerson = eventPerson;
	}

	public String toString() {
		return "My Person Microservice :" + eventType + " Event";
	}

	public Person getEventPerson() {
		return eventPerson;
	}

	public void setEventPerson(Person eventPerson) {
		this.eventPerson = eventPerson;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
}
