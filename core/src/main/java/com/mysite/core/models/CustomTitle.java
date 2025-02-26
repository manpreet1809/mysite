package com.mysite.core.models;


public interface CustomTitle {
    /**
     * Retrieves the title of the custom model.
     *
     * @return The title of the custom model.
     */
    default String getTitle() {
        return null;
    }

}
