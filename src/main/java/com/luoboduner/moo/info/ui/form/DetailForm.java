package com.luoboduner.moo.info.ui.form;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import lombok.Getter;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

/**
 * DetailForm
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2021/11/12.
 */
@Getter
public class DetailForm {
    private JPanel mainPanel;
    private JTree detailTree;

    private static final Log logger = LogFactory.get();

    private static DetailForm detailForm;

    public static DetailForm getInstance() {
        if (detailForm == null) {
            detailForm = new DetailForm();
        }
        return detailForm;
    }

    public static void init() {
        detailForm = getInstance();

        initUi();
        initInfo();
    }

    private static void initUi() {
    }

    private static void initInfo() {
        JTree detailTree = getInstance().getDetailTree();
        DefaultTreeModel defaultTreeModel = new DefaultTreeModel(
                new DefaultMutableTreeNode("JTree") {
                    {
                        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("colors");
                        node1.add(new DefaultMutableTreeNode("blue"));
                        node1.add(new DefaultMutableTreeNode("violet"));
                        node1.add(new DefaultMutableTreeNode("red"));
                        node1.add(new DefaultMutableTreeNode("yellow"));
                        add(node1);
                        node1 = new DefaultMutableTreeNode("sports");
                        node1.add(new DefaultMutableTreeNode("basketball"));
                        node1.add(new DefaultMutableTreeNode("soccer"));
                        node1.add(new DefaultMutableTreeNode("football"));
                        node1.add(new DefaultMutableTreeNode("hockey"));
                        add(node1);
                        node1 = new DefaultMutableTreeNode("food");
                        node1.add(new DefaultMutableTreeNode("hot dogs"));
                        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("pizza");
                        node2.add(new DefaultMutableTreeNode("pizza aglio e olio"));
                        node2.add(new DefaultMutableTreeNode("pizza margherita bianca"));
                        node1.add(node2);
                        node1.add(new DefaultMutableTreeNode("ravioli"));
                        node1.add(new DefaultMutableTreeNode("bananas"));
                        add(node1);
                    }
                });
        detailTree.setModel(defaultTreeModel);
        detailTree.setEditable(false);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        final JScrollPane scrollPane1 = new JScrollPane();
        mainPanel.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        scrollPane1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        scrollPane1.setViewportView(panel1);
        detailTree = new JTree();
        panel1.add(detailTree, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
