<#--
    The per-constant fragment overrides, in one place so the seven element templates that need them agree.

    jmsfx#122: an element used to return the *location* of its fragment and the drawing was read from the classpath at render time. Now the drawing is on the element. Kept as a macro
    rather than copied into each template because the escaping and the FULL_FRAME shape are the parts easiest to get subtly wrong, and a difference between templates would show up as
    one symbol set rendering differently from the rest.

    ?j_string, not ?json_string: JSON escapes a forward slash as \/, which is not a legal Java escape, and every fragment contains closing tags.
-->
<#--
    A main icon's markup. A FULL_FRAME element is four drawings, one per identity group, because the icon *is* the frame - so it switches, the way DimensionEnum.getFrameBounds does
    for frame bounds. Everything else ignores the identity.
-->
<#macro main el>
    <#if el.graphicMarkupByGroup??>

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return switch (identity.getGroup()
                    .getId()) {
        <#list el.graphicMarkupByGroup as group, markup>
                    case "${group}" -> "${markup?j_string}";
        </#list>
                    default -> null;
                };
            }
    <#elseif el.graphicMarkup??>

            @Override
            public String getGraphicMarkup(StandardIdentity identity) {
                return "${el.graphicMarkup?j_string}";
            }
    </#if>
</#macro>
<#-- A modifier's markup. One drawing, no identity: a sector modifier is the same whoever is drawing it. -->
<#macro modifier mod>
    <#if mod.graphicMarkup??>

            @Override
            public String getGraphicMarkup() {
                return "${mod.graphicMarkup?j_string}";
            }
    </#if>
</#macro>
