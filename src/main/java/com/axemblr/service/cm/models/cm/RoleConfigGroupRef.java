package com.axemblr.service.cm.models.cm;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class RoleConfigGroupRef
{
  private final String roleConfigGroupName;

  @JsonCreator
  public RoleConfigGroupRef(@JsonProperty("roleConfigGroupName") String roleConfigGroupName)
  {
    this.roleConfigGroupName = roleConfigGroupName;
  }
  public String getRoleConfigGroupName() {
    return this.roleConfigGroupName;
  }
}