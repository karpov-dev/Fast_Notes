package by.kitty.fastnotes.Model;

import android.provider.ContactsContract;

public abstract class DatabaseObject {
    private String id;
    private String name;

    public DatabaseObject() {}

    public DatabaseObject(String id) {
        this.id = id;
    }

    public DatabaseObject(String id, String name) {
        this(id);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
