package edu.hogwarts.data;

public class Tool {

    private String tool;
    private String description;

    public Tool(String tool, String description) {
        this.tool = tool;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "tool='" + tool + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
