/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.junit_cucumber.test;

import cucumber.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
    //this code will only look into "features/" folder for features
    features = {"features/"},
    glue = { "acceptanceTest.Steps"},
    format = {"pretty", "html:target/reporter-html", "json:target/cucumber.json" },
    tags = { "@test" }
    )
public class PesquisaSitesIndexidosTest{
}
