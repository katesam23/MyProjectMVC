package repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Group;
import model.Student;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GroupRepository {
    private Map<Short, Group> groupMap = new HashMap<>();



    //логика работы с сериализацией
    public void addToJson(Map<Short, Group> groupMap) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter("file.json");
        writer.write(gson.toJson(groupMap));
        writer.close();
    }

    public Map<Short, Group> view() throws FileNotFoundException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        BufferedReader reader = new BufferedReader(new FileReader("file.json"));
        Type type = new TypeToken<Map<Short, Group>>() {}.getType();
        Map<Short, Group> groupMap = gson.fromJson(reader, type);
        return groupMap;

    }

}
