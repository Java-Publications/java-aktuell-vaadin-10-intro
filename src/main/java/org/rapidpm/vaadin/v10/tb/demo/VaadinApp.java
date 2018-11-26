/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.vaadin.v10.tb.demo;


import static java.lang.String.valueOf;

import org.rapidpm.vaadin.v10.tb.demo.layout.LayoutWithMenuBar;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = LayoutWithMenuBar.class, absolute = false)
public class VaadinApp extends Composite<VerticalLayout> {

  private final Button btnClickMe = new Button("click me");
  private final Span lbClickCount = new Span("0");

  private int clickcount = 0;

  public VaadinApp() {
    btnClickMe.addClickListener(event -> lbClickCount.setText(valueOf(++ clickcount)));
    getContent().add(btnClickMe , lbClickCount);
  }
}
