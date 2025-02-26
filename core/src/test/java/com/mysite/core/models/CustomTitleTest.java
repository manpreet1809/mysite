package com.mysite.core.models;

import com.mysite.core.models.impl.CustomTitleImpl;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AemContextExtension.class)
class CustomTitleTest {

    private final AemContext context = new AemContext();
    private static final String TITLE_VALUE = "Custom Title";
    private static final String RESOURCE_PATH = "/content/page/customtitle";

    @BeforeEach
    void setUp() {
        context.addModelsForClasses(CustomTitleImpl.class);
        context.create().resource(RESOURCE_PATH,
                "sling:resourceType", "mysite/components/customtitle",
                "title", TITLE_VALUE);
    }

    @Test
    void testGetTitle() {
        Resource resource = context.resourceResolver().getResource(RESOURCE_PATH);
        assertNotNull(resource);

        CustomTitle customTitle = resource.adaptTo(CustomTitle.class);
        assertEquals(TITLE_VALUE, customTitle.getTitle());
    }
}
