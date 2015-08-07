package com.soika;

import static spark.Spark.*;

/**
 * Created by Andrei_Soika on 8/7/2015.
 */
public class HelloWorldSparkStyle {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello world" + req.ip());
    }
}
