package org.i9.dbk.planogram.viewes;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    TextField textField;

    private Button button;

    public MainView() {

        this.textField = new TextField();
        this.button = new Button("Button", VaadinIcon.PLUS.create());

        button.addClickListener(buttonClickEvent -> {
            button.setText(textField.getValue());
            Notification.show(textField.getValue(), 5000, Notification.Position.MIDDLE);
        });
        add(textField, button);
    }

}