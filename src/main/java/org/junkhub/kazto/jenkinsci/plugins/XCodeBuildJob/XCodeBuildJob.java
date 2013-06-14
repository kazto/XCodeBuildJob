package org.junkhub.kazto.jenkinsci.plugins.XCodeBuildJob;

import hudson.Extension;
import hudson.model.ItemGroup;
import hudson.model.Project;
import hudson.model.TopLevelItem;
import hudson.model.TopLevelItemDescriptor;
import jenkins.model.Jenkins;

/**
 * Created with IntelliJ IDEA.
 * User: kazto
 * Date: 2013/06/06
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 */
public class XCodeBuildJob
        extends Project<XCodeBuildJob, XCodeBuildRun>
        implements TopLevelItem
{
    public XCodeBuildJob(Jenkins parent, String name) {
        super(parent, name);
    }

    public XCodeBuildJob(ItemGroup parent, String name) {
        super(parent, name);
    }

    @Override
    protected Class<XCodeBuildRun> getBuildClass() {
        return XCodeBuildRun.class;
    }

    public DescriptorImpl getDescriptor() {
        return DESCRIPTOR;
    }

    @Extension(ordinal=1000)
    public static final DescriptorImpl DESCRIPTOR = new DescriptorImpl();

    public static final class DescriptorImpl extends TopLevelItemDescriptor {
        public String getDisplayName() {
            return Messages.XCodeBuildJob_DisplayName();
        }

        public XCodeBuildJob newInstance(ItemGroup itemGroup, String s) {
            return new XCodeBuildJob(itemGroup, s);
        }
    }
}
