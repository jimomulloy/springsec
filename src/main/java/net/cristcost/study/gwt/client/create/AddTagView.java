/*
 * Copyright 2013, Cristiano Costantini, Giuseppe Gerla, Michele Ficarra, Sergio Ciampi, Stefano
 * Cigheri.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package net.cristcost.study.gwt.client.create;

import com.google.gwt.user.client.ui.IsWidget;

// TODO: Auto-generated Javadoc
/**
 * The Interface AddTagView.
 */
public interface AddTagView extends IsWidget {

  /**
   * The Interface Presenter.
   */
  public interface Presenter {

    // note: the tag is expected to be created by the server and the username to
    // be extracted from spring securirty context
    /**
     * Adds the tag.
     * 
     * @param tag the tag
     * @param isPublic the is public
     */
    void addTag(String tag, boolean isPublic);
  }

  /**
   * Clear input.
   */
  void clearInput();

  /**
   * Clear message.
   */
  void clearMessage();

  /**
   * Sets the error message.
   * 
   * @param string the new error message
   */
  void setErrorMessage(String string);

  /**
   * Sets the info message.
   * 
   * @param string the new info message
   */
  void setInfoMessage(String string);

  /**
   * Sets the presenter.
   * 
   * @param presenter the new presenter
   */
  void setPresenter(Presenter presenter);
}