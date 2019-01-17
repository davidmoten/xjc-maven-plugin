package com.github.davidmoten.xjc;

import org.apache.maven.plugins.annotations.Parameter;

public class Dependency {

    @Parameter(name = "groupId", required = true)
    private String groupId;

    @Parameter(name = "artifactId", required = true)
    private String artifactId;

    @Parameter(name = "version", required = true)
    private String version;

    @Parameter(name = "type", required = false, defaultValue = "jar")
    private String type;

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getVersion() {
        return version;
    }

    public String getType() {
        return type;
    }

}
