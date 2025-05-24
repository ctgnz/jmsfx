package ${basePackage};

public enum AmplifierType {
<#list amplifierTypes as type>
    ${type}<#if type?is_last>;<#else>,</#if>
</#list>    
}