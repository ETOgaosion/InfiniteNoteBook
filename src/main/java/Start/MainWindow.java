/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Start;
import Bars.ButtonBars.MainWindowButtonBar;
import Bars.SideBar.SideBar;
import java.awt.Color;
import java.util.ArrayList;
import Blocks.*;
import Blocks.BlockType;
import Tools.GitOP;
import Dialogs.PreviewDialog;
import Bars.SideBar.*;
import static Blocks.BlockType.BLANK;
import static Blocks.BlockType.COMMONTEXT;
import static Blocks.BlockType.CODE;
import static Blocks.BlockType.FORMULA;
import static Blocks.BlockType.HYPERTEXT;
import static Blocks.BlockType.IMAGE;
import static Blocks.BlockType.MARKDOWN;
import static Blocks.BlockType.RICHTEXT;
import static Blocks.BlockType.TITLE;
import static Blocks.BlockType.MEDIA;
import static Blocks.BlockType.IMAGE;
import static Blocks.BlockType.VIDEO;
import static Blocks.BlockType.TABLE;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JPanel;

/**
 *
 * @author gzy
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        initComponentsManually();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        MainLayer = new javax.swing.JLayeredPane();
        coverPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        mainScrollPanel = new javax.swing.JScrollPane();
        backgroundLabel = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        workspaceMenu = new javax.swing.JMenu();
        openNewWindowMenutem = new javax.swing.JMenuItem();
        closeAppMenuItem = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        importMenuItem = new javax.swing.JMenuItem();
        exportMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cpyMemuItem = new javax.swing.JMenuItem();
        cutMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        appendMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        findMenuItem = new javax.swing.JMenuItem();
        replaceMenuItem = new javax.swing.JMenuItem();
        GitMenu = new javax.swing.JMenu();
        gitInitMenuItem = new javax.swing.JMenuItem();
        gitAddMenuItem = new javax.swing.JMenuItem();
        gitCommitMenuItem = new javax.swing.JMenuItem();
        gitPushMenuItem = new javax.swing.JMenuItem();
        gitPullMenuItem = new javax.swing.JMenuItem();
        settingsMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coverPanel.setBackground(new Color(0,0,0,75));
        coverPanel.setPreferredSize(new java.awt.Dimension(1400, 920));

        mainPanel.setOpaque(false);
        mainPanel.setSize(new java.awt.Dimension(1200, 878));

        mainScrollPanel.setBackground(new Color(0,0,0,0)
        );
        mainScrollPanel.setForeground(new Color(0,0,0,0)
        );
        mainScrollPanel.setOpaque(false);
        mainScrollPanel.setPreferredSize(new java.awt.Dimension(1200, 878));
        mainScrollPanel.setRequestFocusEnabled(false);
        mainScrollPanel.setSize(new java.awt.Dimension(1200, 878));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout coverPanelLayout = new javax.swing.GroupLayout(coverPanel);
        coverPanel.setLayout(coverPanelLayout);
        coverPanelLayout.setHorizontalGroup(
            coverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coverPanelLayout.createSequentialGroup()
                .addGap(0, 196, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        coverPanelLayout.setVerticalGroup(
            coverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coverPanelLayout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainLayer.add(coverPanel);
        coverPanel.setBounds(0, 0, 1390, 920);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main_background.png"))); // NOI18N
        MainLayer.add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1390, 920);

        workspaceMenu.setText("Workspace");

        openNewWindowMenutem.setText("Open New Window");
        openNewWindowMenutem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openNewWindowMenutemActionPerformed(evt);
            }
        });
        workspaceMenu.add(openNewWindowMenutem);

        closeAppMenuItem.setText("Close App");
        workspaceMenu.add(closeAppMenuItem);

        mainMenuBar.add(workspaceMenu);

        fileMenu.setText("File");

        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setText("Sace As");
        fileMenu.add(saveAsMenuItem);

        importMenuItem.setText("Import");
        fileMenu.add(importMenuItem);

        exportMenuItem.setText("Export");
        fileMenu.add(exportMenuItem);

        mainMenuBar.add(fileMenu);

        editMenu.setText("Edit Block");

        cpyMemuItem.setText("Copy");
        cpyMemuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpyMemuItemActionPerformed(evt);
            }
        });
        editMenu.add(cpyMemuItem);

        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        appendMenuItem.setText("Append");
        editMenu.add(appendMenuItem);

        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        findMenuItem.setText("Find");
        editMenu.add(findMenuItem);

        replaceMenuItem.setText("Replace");
        editMenu.add(replaceMenuItem);

        mainMenuBar.add(editMenu);

        GitMenu.setText("Git");

        gitInitMenuItem.setText("init");
        gitInitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitInitMenuItemActionPerformed(evt);
            }
        });
        GitMenu.add(gitInitMenuItem);

        gitAddMenuItem.setText("add .");
        gitAddMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitAddMenuItemActionPerformed(evt);
            }
        });
        GitMenu.add(gitAddMenuItem);

        gitCommitMenuItem.setText("commit");
        gitCommitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitCommitMenuItemActionPerformed(evt);
            }
        });
        GitMenu.add(gitCommitMenuItem);

        gitPushMenuItem.setText("push");
        gitPushMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitPushMenuItemActionPerformed(evt);
            }
        });
        GitMenu.add(gitPushMenuItem);

        gitPullMenuItem.setText("pull");
        gitPullMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitPullMenuItemActionPerformed(evt);
            }
        });
        GitMenu.add(gitPullMenuItem);

        mainMenuBar.add(GitMenu);

        settingsMenu.setText("Settings");
        mainMenuBar.add(settingsMenu);

        jMenu1.setText("About");
        mainMenuBar.add(jMenu1);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainLayer, javax.swing.GroupLayout.DEFAULT_SIZE, 1380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsManually(){
        mainPanel.setSize(new Dimension(1200,878));
        mainPanel.setPreferredSize(new Dimension(1200,878));
        mainScrollPanel.getViewport().setOpaque(false);
        mainScrollPanel.getViewport().setLayout(null);
        mainScrollPanel.setSize(new Dimension(1200,878));
        mainScrollPanel.setPreferredSize(new Dimension(1200,878));
        mainContainerPanel.setBounds(0,0,1200,878);
        mainContainerPanel.setLayout(new GridLayout(0,1));
        mainContainerPanel.setOpaque(false);
        mainScrollPanel.getViewport().setView(mainContainerPanel);
        AdjustmentListener repaintListener = new repaintAdjustListener(this);
        mainScrollPanel.getHorizontalScrollBar().addAdjustmentListener(repaintListener);
        mainScrollPanel.getVerticalScrollBar().addAdjustmentListener(repaintListener);
        mainButtonBar = new Bars.ButtonBars.MainWindowButtonBar(this);
        mainButtonBar.setBounds(50, 0, 1300, 41);
        MainLayer.add(mainButtonBar);
        MainLayer.moveToFront(mainButtonBar);
        sideBar = new SideBar(this);
        sideBar.setBounds(0, 42, 200, 878);
        coverPanel.add(sideBar);
        coverPanel.revalidate();
        coverPanel.repaint();
    }
    
    private class AddBlockReturnValue{
        int index;
        int height;

        public AddBlockReturnValue(int thisIndex, int thisHight) {
            index = thisIndex;
            height = thisHight;
        }
        
    }
    
    private AddBlockReturnValue addInputBlock(int height){
        int index = inputBlockList.size() - 1;
        inputBlockList.get(index).setBounds(0, 0, 1200, 300);
        return new AddBlockReturnValue(index,300);
    }
    
    private AddBlockReturnValue addMediaBlock(int height){
        int index = mediaBlockList.size() - 1;
        mediaBlockList.get(index).setBounds(0, 0, 1200, 200);
        return new AddBlockReturnValue(index,200);
    }
    
    public AddBlockReturnValue simplyAddBlock(BlockType newBlockType, int height){
        int index = 0;
        int curBlockHeight = 0;
        switch(newBlockType){
            case BLANK->{
                blankBlockList.add(new BlankBlock(this));
                index = blankBlockList.size() - 1;
                blankBlockList.get(index).setBounds(0, 0, 1200, 100);
                totalBlockList.add(new BlockDocument(BLANK,height));
                blankBlockList.get(index).setID(totalBlockList.size() - 1);
                curBlockHeight = 100;
            }
            case COMMONTEXT->{
                inputBlockList.add(new CommonTextBlock(this,COMMONTEXT));
                AddBlockReturnValue ret = addInputBlock(height);
                index = ret.index;
                curBlockHeight = ret.height;
                totalBlockList.add(new BlockDocument(COMMONTEXT,height));
                inputBlockList.get(index).setID(totalBlockList.size() - 1);
            }
            case CODE->{
                inputBlockList.add(new CodeBlock(this, BlockType.CODE));
                AddBlockReturnValue ret = addInputBlock(height);
                index = ret.index;
                curBlockHeight = ret.height;
                totalBlockList.add(new BlockDocument(CODE,height));
                inputBlockList.get(index).setID(totalBlockList.size() - 1);
            }
            case HYPERTEXT->{
                inputBlockList.add(new HyperTextBlock(this));
                AddBlockReturnValue ret = addInputBlock(height);
                index = ret.index;
                curBlockHeight = ret.height;
                totalBlockList.add(new BlockDocument(HYPERTEXT,height));
                inputBlockList.get(index).setID(totalBlockList.size() - 1);
            }
            case MARKDOWN->{
                inputBlockList.add(new MarkdownBlock(this));
                AddBlockReturnValue ret = addInputBlock(height);
                index = ret.index;
                curBlockHeight = ret.height;
                totalBlockList.add(new BlockDocument(MARKDOWN,height));
                inputBlockList.get(index).setID(totalBlockList.size() - 1);
            }
            case FORMULA->{
                inputBlockList.add(new FormulaBlock(this));
                AddBlockReturnValue ret = addInputBlock(height);
                index = ret.index;
                curBlockHeight = ret.height;
                totalBlockList.add(new BlockDocument(FORMULA,height));
                inputBlockList.get(index).setID(totalBlockList.size() - 1);
            }
            case RICHTEXT->{
                richTextBlockList.add(new RichTextBlock(this));
                index = richTextBlockList.size() - 1;
                curBlockHeight = 300;
                totalBlockList.add(new BlockDocument(RICHTEXT,height));
                richTextBlockList.get(index).setID(totalBlockList.size() - 1);
                richTextBlockList.get(index).setID(totalBlockList.size() - 1);
            }
            case TITLE->{
                inputBlockList.add(new InfiniteTitle(this));
                AddBlockReturnValue ret = addInputBlock(height);
                index = ret.index;
                curBlockHeight = ret.height;
                totalBlockList.add(new BlockDocument(TITLE,height));
                inputBlockList.get(index).setID(totalBlockList.size() - 1);
            }
            case IMAGE->{
                mediaBlockList.add(new ImageBlock(this));
                totalBlockList.add(new BlockDocument(IMAGE,height));
                mediaBlockList.get(index).setID(totalBlockList.size() - 1);
                AddBlockReturnValue ret = addMediaBlock(height);
                index = ret.index;
                curBlockHeight = ret.height;
            }
            case VIDEO->{
                mediaBlockList.add(new VideoBlock(this));
                totalBlockList.add(new BlockDocument(VIDEO,height));
                mediaBlockList.get(index).setID(totalBlockList.size() - 1);
                AddBlockReturnValue ret = addMediaBlock(height);
                index = ret.index;
                curBlockHeight = ret.height;
            }
            case TABLE->{
                tableBlockList.add(new TableBlock(this));
                index = tableBlockList.size() - 1;
                tableBlockList.get(index).setBounds(0, 0, 1200, 300);
                totalBlockList.add(new BlockDocument(TABLE,height));
                tableBlockList.get(index).setID(totalBlockList.size() - 1);
            }
            default->{
            }
        }
        return new AddBlockReturnValue(index,curBlockHeight);
    }
    
    
    public BlockDocument simplyRemoveBlock(int index){
        if(index < 0 || index >= totalBlockList.size() || totalBlockList.isEmpty()){
            return null;
        }
        BlockDocument deleteBlockDoc = totalBlockList.remove(index);
        switch(deleteBlockDoc.blockType){
            case BLANK->{
                blankBlockList.remove(deleteBlockDoc.index);
            }
            case COMMONTEXT,CODE,HYPERTEXT,MARKDOWN,FORMULA,TITLE->{
                inputBlockList.remove(deleteBlockDoc.index);
            }
            case RICHTEXT->{
                richTextBlockList.remove(deleteBlockDoc.index);
            }
            case MEDIA,IMAGE,VIDEO->{
                mediaBlockList.remove(deleteBlockDoc.index);
            }
            case TABLE->{
                tableBlockList.remove(deleteBlockDoc.index);
            }
            default->{
            }
        }
        removeBlockPhysically(deleteBlockDoc);
        return deleteBlockDoc;
    }
    
    public int simplyInsertBlock(int index, int height, BlockType newBlockType){
        if(index < 0 || index >= totalBlockList.size() || totalBlockList.isEmpty()){
            return -1;
        }
        int insertIndex = 0;
        int curBlockHeight = 0;
        AddBlockReturnValue ret = simplyAddBlock(newBlockType,height);
        insertIndex = ret.index;
        curBlockHeight = ret.height;
        totalBlockList.add(index, new BlockDocument(newBlockType,height));
        totalBlockList.get(index).height = curBlockHeight;
        return curBlockHeight;
    }
    
    public boolean appendBlock(BlockType newBlockType){
        int index = 0;
        int curBlockHeight = 0;
        AddBlockReturnValue ret = simplyAddBlock(newBlockType,totalHeight);
        index = ret.index;
        curBlockHeight = ret.height;
        
        totalBlockList.get(totalBlockList.size() - 1).setIndex(index);
        totalBlockList.get(totalBlockList.size() - 1).setHight(curBlockHeight);
        totalBlockList.get(totalBlockList.size() - 1).needreRender = false;
        totalHeight += curBlockHeight;
        rendering();
        return true;
    }
    
    /*
    public boolean adjustBlockVerticalPosition(int index, int adjustHeight){
        if(index < 0 || index >= totalBlockList.size() || totalBlockList.isEmpty()){
            return false;
        }
        BlockDocument toAdjusBlockDocument;
        for(int i = index; i < totalBlockList.size(); i++){
            toAdjusBlockDocument = totalBlockList.get(i);
            toAdjusBlockDocument.setStartHight(toAdjusBlockDocument.getStartHeight() - adjustHeight);
            switch(toAdjusBlockDocument.blockType){
                case BLANK->{
                    blankBlockList.get(toAdjusBlockDocument.index).setBounds(100, toAdjusBlockDocument.height, 1200, 100);
                }
                case COMMONTEXT,CODE,HYPERTEXT,MARKDOWN,FORMULA,RICHTEXT,TITLE->{
                    inputBlockList.get(toAdjusBlockDocument.index).setBounds(100, toAdjusBlockDocument.height, 1200, 300);
                }
                case MEDIA,IMAGE,VIDEO->{
                    mediaBlockList.get(toAdjusBlockDocument.index).setBounds(100, toAdjusBlockDocument.height, 1200, 200);
                }
                case TABLE->{
                    tableBlockList.get(toAdjusBlockDocument.index).setBounds(100, toAdjusBlockDocument.height, 1200, 300);
                }
                default->{
                }
            }
        }
        return true;
    }*/
    
    
    public boolean deleteBlock(int index){
        if(index < 0 || index >= totalBlockList.size() || totalBlockList.isEmpty()){
            return false;
        }
        BlockDocument deleteBlockDocument = simplyRemoveBlock(index);
        totalHeight -= deleteBlockDocument.height;
        //adjustBlockVerticalPosition(index, deleteBlockDocument.height);
        rendering();
        return true;
    }
    
    public boolean popBlock(){
        return deleteBlock(totalBlockList.size() - 1);
    }
    
    public boolean changeBlock(int index, BlockType newType){
        if(index < 0 || index >= totalBlockList.size() || totalBlockList.isEmpty()){
            return false;
        }
        int adjustHeight = 0;
        BlockDocument deleteBlockDocument = simplyRemoveBlock(index);
        adjustHeight = deleteBlockDocument.height - simplyInsertBlock(index, deleteBlockDocument.startHeight, newType);
        //adjustBlockVerticalPosition(index, adjustHeight);
        rendering();
        return true;
    }
    
    public boolean removeBlockPhysically(BlockDocument currDocument){
        switch(currDocument.blockType){
            case BLANK->{
                BlankBlock deleteBlankBlock = blankBlockList.get(currDocument.index);
                mainContainerPanel.remove(deleteBlankBlock);
            }
            case COMMONTEXT,CODE,HYPERTEXT,MARKDOWN,FORMULA,TITLE->{
                CommonTextBlock deleteCommonTextBlock = inputBlockList.get(currDocument.index);
                mainContainerPanel.remove(deleteCommonTextBlock);
            }
            case RICHTEXT->{
                RichTextBlock deleteCommonTextBlock = richTextBlockList.get(currDocument.index);
                mainContainerPanel.remove(deleteCommonTextBlock);
            }
            case MEDIA,IMAGE,VIDEO->{
                MediaBlock deleteMediaBlock = mediaBlockList.get(currDocument.index);
                mainContainerPanel.remove(deleteMediaBlock);
            }
            case TABLE->{
                TableBlock deleteTableBlock = tableBlockList.get(currDocument.index);
                mainContainerPanel.remove(deleteTableBlock);
            }
            default->{
                return false;
            }
        };
        return true;
    }
    
    public boolean rendering(){
        if(totalBlockList.isEmpty()){
            return false;
        }
//        if(totalHeight < 901){
//            mainScrollPanel.setSize(new Dimension(1200,totalHeight));
//            mainScrollPanel.setPreferredSize(new Dimension(1200,totalHeight));
//        }
//        else{
//            mainScrollPanel.setSize(new Dimension(1200,878));
//            mainScrollPanel.setPreferredSize(new Dimension(1200,878));
//        }
        mainContainerPanel.setSize(new Dimension(1200,totalHeight));
        for (int i = 0; i < totalBlockList.size(); i++) {
            BlockDocument currDocument = totalBlockList.get(i);
            if(currDocument.rendered == true && currDocument.needreRender == false){
                continue;
            }
            else if(currDocument.rendered == true && currDocument.needreRender == true){
                removeBlockPhysically(currDocument);
            }
            switch(currDocument.blockType){
                case BLANK->{
                    BlankBlock renderBlankBlock = blankBlockList.get(currDocument.index);
                    renderBlankBlock.setOpaque(false);
                    mainContainerPanel.add(renderBlankBlock,null);
                }
                case COMMONTEXT,CODE,HYPERTEXT,MARKDOWN,FORMULA,TITLE->{
                    CommonTextBlock renderCommonTextBlock = inputBlockList.get(currDocument.index);
                    renderCommonTextBlock.setOpaque(false);
                    mainContainerPanel.add(renderCommonTextBlock,null);
                }
                case RICHTEXT->{
                    RichTextBlock renderRichTextBlock = richTextBlockList.get(currDocument.index);
                    renderRichTextBlock.setOpaque(false);
                    mainContainerPanel.add(renderRichTextBlock,null);
                }
                case MEDIA,IMAGE,VIDEO->{
                    MediaBlock renderMediaBlock = mediaBlockList.get(currDocument.index);
                    renderMediaBlock.setOpaque(false);
                    mainContainerPanel.add(renderMediaBlock,null);
                }
                case TABLE->{
                    TableBlock renderTableBlock = tableBlockList.get(currDocument.index);
                    renderTableBlock.setOpaque(false);
                    mainContainerPanel.add(renderTableBlock,null);
                }
                default->{
                    continue;
                }
            }
            revalidate();
            repaint();
            mainContainerPanel.revalidate();
            mainContainerPanel.repaint();
            mainScrollPanel.setViewportView(mainContainerPanel);
            currDocument.rendered = true;
        }
        return true;
    }
    
    public void compileAll(){
        totalHtml = "";
        for(int i = 0; i < totalBlockList.size(); i++){
            BlockDocument currDocument = totalBlockList.get(i);
            String curHtmlString;
            switch(currDocument.blockType){
                case BLANK->{
                    BlankBlock renderBlankBlock = blankBlockList.get(currDocument.index);
                    renderBlankBlock.getBlockBasic().Compile();
                    curHtmlString = renderBlankBlock.getBlockBasic().getHtmlContent();
                }
                case COMMONTEXT,CODE,HYPERTEXT,MARKDOWN,FORMULA,TITLE->{
                    CommonTextBlock renderCommonTextBlock = inputBlockList.get(currDocument.index);
                    renderCommonTextBlock.getBlockBasic().Compile();
                    curHtmlString = renderCommonTextBlock.getBlockBasic().getHtmlContent();
                }
                case RICHTEXT->{
                    RichTextBlock renderRichTextBlock = richTextBlockList.get(currDocument.index);
                    renderRichTextBlock.getBlockBasic().Compile();
                    curHtmlString = renderRichTextBlock.getBlockBasic().getHtmlContent();
                }
                case MEDIA,IMAGE,VIDEO->{
                    MediaBlock renderMediaBlock = mediaBlockList.get(currDocument.index);
                    renderMediaBlock.getBlockBasic().Compile();
                    curHtmlString = renderMediaBlock.getBlockBasic().getHtmlContent();
                }
                case TABLE->{
                    TableBlock renderTableBlock = tableBlockList.get(currDocument.index);
                    renderTableBlock.getBlockBasic().Compile();
                    curHtmlString = renderTableBlock.getBlockBasic().getHtmlContent();
                }
                default->{
                    continue;
                }
            }
            totalHtml.concat(curHtmlString);
        }
    }
    
    public void preview(){
        compileAll();
        PreviewDialog newPreviewDialog = new PreviewDialog(this,true,totalHtml);
        newPreviewDialog.setVisible(true);
    }
    
    public void repaintMainPane(){
        mainScrollPanel.revalidate();
        mainScrollPanel.repaint();
        mainContainerPanel.revalidate();
        mainContainerPanel.repaint();
        revalidate();
        repaint();
    }
    
    public class repaintAdjustListener implements AdjustmentListener{
        public repaintAdjustListener(MainWindow par) {
            super();
            parMainWindow = par;
        }
        
        
        public void adjustmentValueChanged(AdjustmentEvent evt){
            parMainWindow.repaintMainPane();
        }
        
        private MainWindow parMainWindow;
    }
    
    private void openNewWindowMenutemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openNewWindowMenutemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openNewWindowMenutemActionPerformed

    private void cpyMemuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpyMemuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpyMemuItemActionPerformed

    private void gitInitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitInitMenuItemActionPerformed
        // TODO add your handling code here:
        mainGitOP.gitInit();
    }//GEN-LAST:event_gitInitMenuItemActionPerformed

    private void gitAddMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitAddMenuItemActionPerformed
        // TODO add your handling code here:
        mainGitOP.gitAdd();
    }//GEN-LAST:event_gitAddMenuItemActionPerformed

    private void gitCommitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitCommitMenuItemActionPerformed
        // TODO add your handling code here:
        mainGitOP.gitCommit();
    }//GEN-LAST:event_gitCommitMenuItemActionPerformed

    private void gitPushMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitPushMenuItemActionPerformed
        // TODO add your handling code here:
        mainGitOP.gitPush();
    }//GEN-LAST:event_gitPushMenuItemActionPerformed

    private void gitPullMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitPullMenuItemActionPerformed
        // TODO add your handling code here:
        mainGitOP.gitPull();
    }//GEN-LAST:event_gitPullMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainWindow mainWindowObj = new MainWindow();
                mainWindowObj.setVisible(true);
                mainWindowObj.setBounds(0, 0, 1400, 960);
            }
        });
    }
    
    private MainWindowButtonBar mainButtonBar;
    private ArrayList<BlankBlock> blankBlockList = new ArrayList<>();
    private ArrayList<CommonTextBlock> inputBlockList = new ArrayList<>();
    private ArrayList<RichTextBlock> richTextBlockList = new ArrayList<>();
    private ArrayList<MediaBlock> mediaBlockList = new ArrayList<>();
    private ArrayList<TableBlock> tableBlockList = new ArrayList<>();
    
    private GitOP mainGitOP = new GitOP();
    
    public class BlockDocument{
        public BlockType blockType = BlockType.BLANK;
        public int index = 0;
        public int startHeight = 0;
        public int height = 0;
        public boolean rendered = false;
        public boolean needreRender = false;

        public BlockDocument(BlockType thisBlockType) {
            blockType = thisBlockType;
        }
        
        public BlockDocument(BlockType thisBlockType, int thisStartHeight) {
            blockType = thisBlockType;
            startHeight = thisStartHeight;
        }
        
        public boolean setIndex(int newIndex){
            index = newIndex;
            return true;
        }
        
        public boolean setHight(int newHight){
            height = newHight;
            needreRender = true;
            return true;
        }
        
        public int getHight(){
            return height;
        }
        
        public boolean setStartHight(int newStartHeight){
            startHeight = newStartHeight;
            needreRender = true;
            return true;
        }
        
        public int getStartHeight(){
            return startHeight;
        }
    }
    
    private ArrayList<BlockDocument> totalBlockList = new ArrayList<>();
    private javax.swing.JPanel mainContainerPanel = new javax.swing.JPanel();
    private int totalHeight = 0;
    private String totalHtml;
    private SideBar sideBar;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu GitMenu;
    private javax.swing.JLayeredPane MainLayer;
    private javax.swing.JMenuItem appendMenuItem;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JMenuItem closeAppMenuItem;
    private javax.swing.JPanel coverPanel;
    private javax.swing.JMenuItem cpyMemuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem findMenuItem;
    private javax.swing.JMenuItem gitAddMenuItem;
    private javax.swing.JMenuItem gitCommitMenuItem;
    private javax.swing.JMenuItem gitInitMenuItem;
    private javax.swing.JMenuItem gitPullMenuItem;
    private javax.swing.JMenuItem gitPushMenuItem;
    private javax.swing.JMenuItem importMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPanel;
    private javax.swing.JMenuItem openNewWindowMenutem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem replaceMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JMenu workspaceMenu;
    // End of variables declaration//GEN-END:variables
}
