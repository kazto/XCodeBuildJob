package org.junkhub.kazto.jenkinsci.plugins.XCodeBuildJob;

import hudson.model.Build;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: kazto
 * Date: 2013/06/06
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 */
public class XCodeBuildRun extends Build<XCodeBuildJob, XCodeBuildRun> {
    protected XCodeBuildRun(XCodeBuildJob project) throws IOException {
        super(project);
    }

    protected XCodeBuildRun(XCodeBuildJob job, Calendar timestamp) {
        super(job, timestamp);
    }

    protected XCodeBuildRun(XCodeBuildJob project, File buildDir) throws IOException {
        super(project, buildDir);
    }
}
