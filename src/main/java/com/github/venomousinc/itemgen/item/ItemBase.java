package com.github.venomousinc.itemgen.item;

import com.github.venomousinc.itemgen.util.StringUtils;

public class ItemBase {

    private String name;
    private String description;

    public ItemBase(String name) {
        setName(name);
        setDescription(null);
    }

    /**
     * Get the name of this Item.
     * @see #name
     * @see #setName(String)
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set the Item Name, with {@link StringUtils#capitalize(String)} function.
     * @see #name
     * @param name
     */
    public void setName(String name) {
        this.name = StringUtils.capitalize(name);
    }

    /**
     * @see #description
     * @see #setDescription(String)
     * @return The Item's Description, if null it is set to a default Description.
     */
    public String getDescription() {
        if(description == null) {
            description = String.format("A %s.", this.name);
        }
        return description;
    }

    /**
     * Set the Items Description.
     * @see #description
     * @see #getDescription()
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
