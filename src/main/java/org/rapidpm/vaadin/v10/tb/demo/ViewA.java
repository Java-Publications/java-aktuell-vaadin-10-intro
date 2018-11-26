package org.rapidpm.vaadin.v10.tb.demo;

import org.rapidpm.vaadin.v10.tb.demo.layout.LayoutWithMenuBar;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "ViewA", layout = LayoutWithMenuBar.class)
public class ViewA extends Composite<Div> {

  public ViewA() {
    getContent().add(new Span("ViewA"));
  }
}
