package com.danielpinczes.haffner.smartcomparative;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class SmartComperativeApplicationUI extends UI {

    private VerticalLayout layout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupLayout();
        addExpectedTableChooser();
        addActualTableChooser();
        addActionButton();
    }

    private void setupLayout() {
        layout = new VerticalLayout();
        setContent(layout);

    }

    private void addExpectedTableChooser() {
        Label expectedDescription = new Label("First box description");
        layout.addComponent(expectedDescription);
//        Upload upload = new Upload("Upload it here", receiver);
//        upload.setImmediateMode(true);
    }

    private void addActualTableChooser() {

    }

    private void addActionButton() {

    }

}
