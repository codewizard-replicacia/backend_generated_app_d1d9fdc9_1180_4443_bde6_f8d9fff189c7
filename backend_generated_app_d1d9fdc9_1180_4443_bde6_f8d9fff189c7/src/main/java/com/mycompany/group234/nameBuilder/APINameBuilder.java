package com.mycompany.group234.nameBuilder;


import com.sap.olingo.jpa.metadata.core.edm.mapper.api.JPAEdmNameBuilder;
import com.sap.olingo.jpa.metadata.core.edm.mapper.impl.JPADefaultEdmNameBuilder;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EmbeddableType;
import javax.persistence.metamodel.EntityType;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Date;

public class APINameBuilder implements JPAEdmNameBuilder {
    private final JPAEdmNameBuilder defaultNameBuilder;

    public APINameBuilder(final String punit) {
        defaultNameBuilder = new JPADefaultEdmNameBuilder(punit);
    }

    @Override
    public String buildComplexTypeName(final EmbeddableType<?> jpaEmbeddedType) {
        return defaultNameBuilder.buildComplexTypeName(jpaEmbeddedType);
    }

    @Override
    public String buildContainerName() {
        return defaultNameBuilder.buildContainerName();
    }

    @Override
	public String buildEntitySetName(final String entityTypeName) {
    	String eSetName = null;
    	
    	eSetName = "PackageManagement".equals(entityTypeName) ? "PackageManagements" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "UIComp".equals(entityTypeName) ? "UIComps" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "Architecture".equals(entityTypeName) ? "Architectures" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "Server".equals(entityTypeName) ? "Servers" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "UITemplate".equals(entityTypeName) ? "UITemplates" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "FrontendScreen".equals(entityTypeName) ? "FrontendScreens" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "BuildTool".equals(entityTypeName) ? "BuildTools" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "UIField".equals(entityTypeName) ? "UIFields" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "Document".equals(entityTypeName) ? "Documents" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "FrontendApp".equals(entityTypeName) ? "FrontendApps" : defaultNameBuilder.buildEntitySetName(entityTypeName);
    	eSetName = "TemplateScreen".equals(entityTypeName) ? "TemplateScreens" : defaultNameBuilder.buildEntitySetName(entityTypeName);
        return eSetName;
    }

    @Override
    public String buildEntityTypeName(final EntityType<?> jpaEntityType) {
        return defaultNameBuilder.buildEntityTypeName(jpaEntityType);
    }

    @Override
    public String buildEnumerationTypeName(final Class<? extends Enum<?>> javaEnum) {
        return defaultNameBuilder.buildEnumerationTypeName(javaEnum);
    }

    @Override
    public String buildNaviPropertyName(final Attribute<?, ?> jpaAttribute) {
        return defaultNameBuilder.buildNaviPropertyName(jpaAttribute);
    }

    @Override
    public String buildOperationName(final String internalOperationName) {
        return defaultNameBuilder.buildOperationName(internalOperationName);
    }

    @Override
    public String buildPropertyName(final String jpaAttributeName) {
        return defaultNameBuilder.buildPropertyName(jpaAttributeName);
    }

    @Override
    public String getNamespace() {
        return defaultNameBuilder.getNamespace();
    }
}
