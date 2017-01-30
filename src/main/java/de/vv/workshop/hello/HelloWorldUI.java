package de.vv.workshop.hello;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
@Theme("valo")
public class HelloWorldUI extends UI {

  private final SpringViewProvider viewProvider;

  @Autowired
  public HelloWorldUI(SpringViewProvider viewProvider) {
    this.viewProvider = viewProvider;
  }

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    final VerticalLayout root = new VerticalLayout();
    root.setSizeFull();
    root.setMargin(true);
    root.setSpacing(true);
    setContent(root);

    final CssLayout navigationBar = new CssLayout();
    navigationBar.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
    navigationBar.addComponent(createNavigationButton("Home", ""));
    navigationBar.addComponent(createNavigationButton("Hello", "greetingView"));
    root.addComponent(navigationBar);

    final Panel viewContainer = new Panel();
    viewContainer.setSizeFull();
    root.addComponent(viewContainer);
    root.setExpandRatio(viewContainer, 1.0f);

    Navigator navigator = new Navigator(this, viewContainer);
    navigator.addProvider(viewProvider);
  }

  private Button createNavigationButton(String caption, final String viewName) {
    Button button = new Button(caption);
    button.addStyleName(ValoTheme.BUTTON_SMALL);
    button.addClickListener(event -> getUI().getNavigator().navigateTo(viewName));
    return button;
  }
}
