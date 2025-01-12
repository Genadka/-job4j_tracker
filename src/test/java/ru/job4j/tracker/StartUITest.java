package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    void whenAddItem() {
        String[] answers = {"Test"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        tracker.add(new Item(input.askStr("Enter name: ")));
        Item created = tracker.findAll()[0];
        Item expected = new Item("Test");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void whenAddTwoItem() {
        String[] answers = {"Fix PC", "Fix Bug"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        tracker.add(new Item(input.askStr("Enter name: ")));
        tracker.add(new Item(input.askStr("Enter name: ")));
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
        created = tracker.findAll()[1];
        expected = new Item("Fix Bug");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "edited item"
        };
        Input input = new MockInput(answers);
        int id = Integer.parseInt(input.askStr("Enter id: "));
        String name = input.askStr("Enter name: ");
        tracker.replace(id, new Item(name));
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        Input input = new MockInput(answers);
        int id = Integer.parseInt(input.askStr("Enter id: "));
        tracker.delete(id);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted).isNull();
    }
}
