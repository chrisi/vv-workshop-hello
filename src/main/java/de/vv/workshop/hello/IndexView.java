package de.vv.workshop.hello;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.Locale;

@SpringView(name = "")
public class IndexView extends VerticalLayout implements View {

  @Value("${version}")
  public String version;

  @PostConstruct
  void init() {
    setLocale(Locale.getDefault());
    setMargin(true);
    setSpacing(true);

    Label viewCaption = new Label("VV-Workshop - Startseite");
    viewCaption.addStyleName(ValoTheme.LABEL_H2);
    viewCaption.addStyleName(ValoTheme.LABEL_NO_MARGIN);
    addComponent(viewCaption);

    Label viewVersion = new Label("Version " + version);
    viewVersion.addStyleName(ValoTheme.LABEL_H4);
    viewVersion.addStyleName(ValoTheme.LABEL_NO_MARGIN);
    addComponent(viewVersion);
  }

  @Override
  public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

  }
}
