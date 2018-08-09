package com.nayakam.tutorial.hibernate.model;

/**
 * Metadata that determines the data type and semantics of a custom Package Field.
 */
public enum RwPackageFieldType {

    /**
     * Yes/no, true/false, on/off.
     * Often rendered as a checkbox.
     */
    BOOLEAN,
    /**
     * Tick/cross/blank (i.e. not done).
     * In other words, a Boolean type that allows null or "undefined".
     */
    TRI_STATE,
    /**
     * General-purpose text input field.
     * If reference data is specified, then the field can present suggested ("type-ahead") values to the user.
     */
    TEXT,
    /**
     * Specific number input field.
     */
    NUMBER,
    /**
     * Date-only field.
     */
    DATE,
    /**
     * Time-only field.
     */
    TIME,
    /**
     * Date & time field.
     */
    DATE_TIME,
    /**
     * Select one value from a list.
     * Can be rendered as a drop-down list box or set of radio buttons.
     *
     * @see RwPackageFieldType#TEXT When the user can select from a list or type in their own value.
     */
    SELECT_SINGLE,
    /**
     * Select one or more values from a list.
     * Can be rendered as a multi-selection list or set of checkboxes.
     */
    SELECT_MULTI,
    /**
     * Password (or obscured text) input field.
     */
    PASSWORD,
    /**
     * A special field, not for user consumption and therefore not displayed, but shall be submitted with the form.
     */
    HIDDEN,
    /**
     * External, dynamic content to display.
     * The content type is identified by MIME/Media Type or filename extension of the field value URI.
     */
    CONTENT,
    /**
     * Field that is a link to an element on the page or place in the application.
     * If the field value is null, the user can be presented with a means to select or search for an item to link to.
     *
     * @see RwPackageTemplateField#linkType
     */
    LINK,
    /**
     * Checkbox and Free-text(only enabled if checkbox = true)
     */
    CHECK_TEXT,
    /**
     * Box to allow the user to type in and have values auto-completed
     */
    SUGGESTION_TEXT,
    
    /**
     * File upload widget
     */
    FILE_UPLOAD,

    /**
     * Label - Will allow just text as a field
     */
    LABEL,
    /**
     * Standard HTML radio button package field
     */
    RADIO,

    /**
     * A rich text editor which stores and reads content as HTML
     */
    HTML,

    /**
     * A html anchor editor which allows for a hyperlink to be edited and opened in a new window
     */
    HTML_ANCHOR,

    /**
     * A latitude field which provides input fields for degrees, minutes, seconds and direction
     */
    LATITUDE,

    /**
     * A longitude field which provides input fields for degrees, minutes, seconds and direction
     */
    LONGITUDE

    }
