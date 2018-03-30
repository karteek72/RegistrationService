package com.mx.hippo.registration.cucumber.stepdefs;

import com.mx.hippo.registration.RegistrationServiceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = RegistrationServiceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
