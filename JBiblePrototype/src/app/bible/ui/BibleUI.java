/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.bible.ui;

import app.bible.test.controller.JBookController;
import app.bible.test.controller.JChapterController;
import app.bible.test.model.JBookModel;
import app.bible.test.model.JChapterModel;
import javax.swing.JList;

/**
 *
 * @author root
 */

/*implement Observer so that the JTextArea can be updated when the Model changees
 using the observer pattern
 */
public class BibleUI extends javax.swing.JPanel {

    private JBookController bookController;
    private JBookModel bookModel;
    private JChapterController chapterController;
    private JChapterModel chapterModel;

    /**
     * Creates new form BibleUI
     */
    public BibleUI() {

        bookModel = new JBookModel();
        chapterModel = new JChapterModel();
        initComponents();
        bookController = new JBookController(bookModel, chapterModel, list_old_testament);
        bookController.setBookList();
        chapterController = new JChapterController(chapterModel);
        bookController.addBookOnClick();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_books_verse = new javax.swing.JPanel();
        books_tab = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_old_testament = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_new_testament = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_chapter = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        verse_messages = new javax.swing.JTextArea();

        panel_books_verse.setBackground(new java.awt.Color(204, 255, 255));

        list_old_testament.setModel(bookModel);
        jScrollPane1.setViewportView(list_old_testament);

        books_tab.addTab("Old Testament", jScrollPane1);

        list_new_testament.setModel(bookModel);
        jScrollPane2.setViewportView(list_new_testament);

        books_tab.addTab("New Testament", jScrollPane2);

        list_chapter.setModel(chapterModel);
        jScrollPane4.setViewportView(list_chapter);

        javax.swing.GroupLayout panel_books_verseLayout = new javax.swing.GroupLayout(panel_books_verse);
        panel_books_verse.setLayout(panel_books_verseLayout);
        panel_books_verseLayout.setHorizontalGroup(
            panel_books_verseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_books_verseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(books_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_books_verseLayout.setVerticalGroup(
            panel_books_verseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_books_verseLayout.createSequentialGroup()
                .addGroup(panel_books_verseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_books_verseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(books_tab))
                    .addGroup(panel_books_verseLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );

        books_tab.getAccessibleContext().setAccessibleName("Old Testament\n");

        verse_messages.setColumns(20);
        verse_messages.setRows(5);
        jScrollPane3.setViewportView(verse_messages);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_books_verse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_books_verse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public JList getList_new_testament() {
        return list_new_testament;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane books_tab;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList list_chapter;
    private javax.swing.JList list_new_testament;
    private javax.swing.JList list_old_testament;
    private javax.swing.JPanel panel_books_verse;
    private javax.swing.JTextArea verse_messages;
    // End of variables declaration//GEN-END:variables
   //create extra variables

}
