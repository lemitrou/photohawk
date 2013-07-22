/*******************************************************************************
 * Copyright 2013 Vienna University of Technology
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package at.ac.tuwien.RAWverna.ui.view;

import java.util.Arrays;
import java.util.List;

import net.sf.taverna.t2.workbench.ui.views.contextualviews.ContextualView;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ContextualViewFactory;
import at.ac.tuwien.RAWverna.JavaFITSEvaluatorActivity;

public class JavaFITSEvaluatorActivityContextViewFactory implements ContextualViewFactory<JavaFITSEvaluatorActivity> {

    public boolean canHandle(Object selection) {
        return selection instanceof JavaFITSEvaluatorActivity;
    }

    public List<ContextualView> getViews(JavaFITSEvaluatorActivity selection) {
        return Arrays.<ContextualView> asList(new JavaFITSEvaluatorContextualView(selection));
    }

}
