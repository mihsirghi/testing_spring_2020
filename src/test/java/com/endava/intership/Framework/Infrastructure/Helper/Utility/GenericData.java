package com.endava.intership.Framework.Infrastructure.Helper.Utility;

import com.endava.intership.Framework.PageObjects.CreateAccount.CreateAccount;
import com.endava.intership.Framework.PageObjects.LoginPage.LoginPage;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.InputMismatchException;

public class GenericData {
    private LoginPage loginPage;
    private CreateAccount createAccount;

    public GenericData(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public GenericData(CreateAccount createAccount) {
        this.createAccount = createAccount;
    }

    public void enterTestData(String input, String field, String page) throws IOException {
        switch (page) {
            case "Secure Checkout":
                secureCheckout(input, field);
                break;
            case "Log in":
                logInInput(input, field);
                break;
            case "Register":
                registerInput(input, field);
                break;
            case "Credit":
                creditInput(input, field);
                break;
            default:
                throw new InputMismatchException("No such page found;");
        }
    }

    public void secureCheckout(String input, String field) {
        switch (field) {
            case "email":
                //Data emailData = new Data()
                break;
            case "password":
                //stuff
                break;
            case "new email":
                //stuff j
                break;
            default:
                throw new InputMismatchException("No such input field found;");
        }
    }

    private void creditInput(String input, String field) {
        switch (field) {
            case "sample":
                //Data emailData = new Data()
                break;
            case "sample2":
                //stuff
                break;
            default:
                throw new InputMismatchException("No such input field found;");
        }
    }

    public void logInInput(String input, String field) throws IOException {
        switch (field) {
            case "email":
                writeEmailLogin(input);
                break;
            case "password":
                writePasswordLogin(input);
                break;
            default:
                throw new InputMismatchException("No such input field found;");
        }
    }

    private void registerInput(String input, String field) throws IOException {
        switch (field) {
            case "email":
                writeEmailRegister(input);
                break;
            case "password":
                writePasswordRegister(input);
                break;
            case "confirm password":
                writeConfirmPasswordRegister(input);
                break;
            default:
                throw new InputMismatchException("No such input field found;");
        }
    }

    public void writeEmailLogin(String input) throws IOException {
        switch (input) {
            case "valid email":
                User[] validUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\validUser.json"));
                loginPage.getEmailField().sendKeys(validUser[0].email);
                break;
            case "invalid email":
                User[] invalidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\invalidUser.json"));
                loginPage.getEmailField().sendKeys(invalidUser[0].email);
                break;
            default:
                throw new InputMismatchException("No such data field found;");
        }
    }

    public void writePasswordLogin(String input) throws IOException {
        switch (input) {
            case "valid password":
                User[] validUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\validUser.json"));
                loginPage.getPasswordField().sendKeys(validUser[0].password);
                break;
            case "invalid password":
                User[] invalidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\invalidUser.json"));
                loginPage.getPasswordField().sendKeys(invalidUser[0].password);
                break;
            default:
                throw new InputMismatchException("No such data field found;");
        }
    }
    public void writeEmailRegister(String input) throws IOException {
        switch (input) {
            case "valid email":
                User[] registerValidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\registerValidUser.json"));
                createAccount.getEmailField().sendKeys(registerValidUser[0].email);
                break;
            case "invalid email":
                User[] registerInvalidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\registerInvalidUser.json"));
                createAccount.getEmailField().sendKeys(registerInvalidUser[0].email);
                break;
            default:
                throw new InputMismatchException("No such data field found;");
        }
    }

    public void writePasswordRegister(String input) throws IOException {
        switch (input) {
            case "valid password":
                User[] registerValidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\registerValidUser.json"));
                createAccount.getPasswordField().sendKeys(registerValidUser[0].password);
                break;
            case "invalid password":
                User[] registerInvalidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\registerInvalidUser.json"));
                createAccount.getPasswordField().sendKeys(registerInvalidUser[0].password);
                break;
            default:
                throw new InputMismatchException("No such data field found;");
        }
    }

    public void writeConfirmPasswordRegister(String input) throws IOException {
        switch (input) {
            case "valid confirm password":
                User[] registerValidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\registerValidUser.json"));
                createAccount.getConfirmPasswordField().sendKeys(registerValidUser[0].confirmPassword);
                break;
            case "invalid confirm password":
                User[] registerInvalidUser = JsonReader.fromJSON(new TypeReference<User[]>() {
                }, Resource.getResourcePath("testdata\\registerInvalidUser.json"));
                createAccount.getConfirmPasswordField().sendKeys(registerInvalidUser[0].confirmPassword);
                break;
            default:
                throw new InputMismatchException("No such data field found;");
        }
    }
}