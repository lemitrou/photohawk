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
package at.ac.tuwien.RAWverna.ui.config;

import java.awt.Frame;
import java.awt.event.ActionEvent;

import net.sf.taverna.t2.workbench.ui.actions.activity.ActivityConfigurationAction;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ActivityConfigurationDialog;
import at.ac.tuwien.RAWverna.JavaImageEvaluatorActivity;
import at.ac.tuwien.RAWverna.JavaImageEvaluatorActivityConfigurationBean;

@SuppressWarnings("serial")
public class JavaImageEvaluatorConfigureAction extends
    ActivityConfigurationAction<JavaImageEvaluatorActivity, JavaImageEvaluatorActivityConfigurationBean> {

    public JavaImageEvaluatorConfigureAction(JavaImageEvaluatorActivity activity, Frame owner) {
        super(activity);
    }

    @SuppressWarnings("unchecked")
    public void actionPerformed(ActionEvent e) {
        ActivityConfigurationDialog<JavaImageEvaluatorActivity, JavaImageEvaluatorActivityConfigurationBean> currentDialog = ActivityConfigurationAction
            .getDialog(getActivity());
        if (currentDialog != null) {
            currentDialog.toFront();
            return;
        }
        JavaImageEvaluatorConfigurationPanel panel = new JavaImageEvaluatorConfigurationPanel(getActivity());
        ActivityConfigurationDialog<JavaImageEvaluatorActivity, JavaImageEvaluatorActivityConfigurationBean> dialog = new ActivityConfigurationDialog<JavaImageEvaluatorActivity, JavaImageEvaluatorActivityConfigurationBean>(
            getActivity(), panel);

        ActivityConfigurationAction.setDialog(getActivity(), dialog);

    }

}
