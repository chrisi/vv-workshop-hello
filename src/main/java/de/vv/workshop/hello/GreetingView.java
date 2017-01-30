package de.vv.workshop.hello;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import javax.annotation.PostConstruct;
import java.util.Locale;

@SpringView(name = "greetingView")
public class GreetingView extends VerticalLayout implements View {

  @PostConstruct
  void init() {
    setLocale(Locale.getDefault());
    setMargin(true);
    setSpacing(true);

    Label viewCaption = new Label("Hallo Welt!");
    viewCaption.addStyleName(ValoTheme.LABEL_H2);
    viewCaption.addStyleName(ValoTheme.LABEL_NO_MARGIN);
    addComponent(viewCaption);
  }

  @Override
  public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

  }
}
