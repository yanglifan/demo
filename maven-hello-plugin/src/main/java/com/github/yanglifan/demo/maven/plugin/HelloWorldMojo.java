package com.github.yanglifan.demo.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "hello", defaultPhase = LifecyclePhase.COMPILE)
public class HelloWorldMojo extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("================ Hello, World!!! ================");
        getLog().info("================ Hello, World!!! ================");
        getLog().info("================ Hello, World!!! ================");
        getLog().info("================ Hello, World!!! ================");
    }
}
