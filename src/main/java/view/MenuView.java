package view;

import model.Group;
import model.Student;
import repository.GroupRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuView {
    public static void main(String[] args) throws IOException {
        GroupRepository groupRepository = new GroupRepository();
        Map<Short, Group> groupMap = new HashMap<>();
        Student student1 = new Student("Samokhvalova Ekaterina Maximovna", "01.09.2017");
        Student student2 = new Student("Ivanov Alexey Alexandrovich", "01.09.2018");
        Student student3 = new Student("Anisimova Darya Alexandrovna", "01.09.2019");
        Student student4 = new Student("Antonov Oleg Andreevich", "01.09.2020");
        List<Student>students1 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        List<Student>students2 = new ArrayList<>();
        students2.add(student3);
        students2.add(student4);
        Group group1 = new Group(1, "economic", students1);
        Group group2 = new Group(2,"kniit", students2);
        groupMap.put((short) 1, group1);
        groupMap.put((short) 2, group2);
        groupRepository.addToJson(groupMap);
        groupRepository.view();
    }
}
