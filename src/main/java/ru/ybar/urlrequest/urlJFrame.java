/*
 * Copyright 2019 Slawka.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.ybar.urlrequest;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import xml.XmlStringFormatter;

/**
 *
 * @author Slawka
 */
public class urlJFrame extends javax.swing.JFrame {

    /**
     * Creates new form urlJFrame
     */
    public urlJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldIp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRequest = new javax.swing.JTextArea();
        jButtonSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaResponse = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldResultCode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUrl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ECSS-10 Request Response");

        jTextFieldIp.setToolTipText("");

        jTextAreaRequest.setColumns(20);
        jTextAreaRequest.setRows(5);
        jTextAreaRequest.setText("<in xmlns:xs=\"http://www.w3.org/2001/XMLSchema-instance\" xs:noNamespaceSchemaLocation=\"get_info.xsd\" />");
        jScrollPane1.setViewportView(jTextAreaRequest);

        jButtonSend.setText("Send");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });

        jTextAreaResponse.setEditable(false);
        jTextAreaResponse.setColumns(20);
        jTextAreaResponse.setRows(5);
        jScrollPane2.setViewportView(jTextAreaResponse);

        jLabel1.setText("ip:");

        jLabel2.setText("Login:");

        jTextFieldLogin.setText("admin");
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        jLabel3.setText("Pass:");

        jPasswordField.setText("password");

        jLabel4.setText("Request");

        jLabel5.setText("Response");

        jTextFieldResultCode.setText("Code: ");

        jLabel6.setText("URL Path:");

        jTextFieldUrl.setText("/commands/get_info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jButtonSend, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUrl))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldResultCode, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldResultCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        try {
            String host = "http://"+jTextFieldIp.getText()+":9999";
            CookieStore cookie = login(jTextFieldLogin.getText(), jPasswordField.getText(), host);
            if (isActive(cookie, host))
            {
                request(cookie, host);
                logout(cookie, host);
            }
        } catch (IOException ex) {
            Logger.getLogger(urlJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSendActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urlJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urlJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaRequest;
    private javax.swing.JTextArea jTextAreaResponse;
    private javax.swing.JTextField jTextFieldIp;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldResultCode;
    private javax.swing.JTextField jTextFieldUrl;
    // End of variables declaration//GEN-END:variables

    private static CookieStore login(String login, String password, String host) throws IOException
    {
        CookieStore cookieStore = new BasicCookieStore();
        CloseableHttpClient client = HttpClients.custom()
                .setDefaultCookieStore(cookieStore)
                .build();
        HttpPost httpPost = new HttpPost(host + "/system/login");
        httpPost.setHeader("Content-Type", "text/xml");
        String xml = "<in><login user = \"" + login + "\" password=\"" + password + "\" /></in>";
        HttpEntity entity = new ByteArrayEntity(xml.getBytes("UTF-8"));
        httpPost.setEntity(entity);
        HttpResponse response = client.execute(httpPost);
        String loginResult = EntityUtils.toString(response.getEntity());
        int loginResultCode = response.getStatusLine().getStatusCode();
        System.out.println("Login rc " + loginResultCode);
        System.out.println("Login result " + loginResult);
        CookieStore resultCookieStore = new BasicCookieStore();
        for (Cookie c : cookieStore.getCookies())
        {
            if (c.getName().equals("token") && c instanceof BasicClientCookie)
            {
                // Нужно для того, чтобы token применялся для всех
                ((BasicClientCookie)c).setPath("/");
                resultCookieStore.addCookie(c);
                return resultCookieStore;
            }
        }
        return cookieStore;
    }
    private boolean isActive(CookieStore cookieStore, String host) throws IOException
    {
        CloseableHttpClient client = HttpClients.custom()
                .setDefaultCookieStore(cookieStore)
                .build();
        HttpGet httpGet = new HttpGet(host + "/system/is_active");
        HttpResponse response = client.execute(httpGet);
        int isActiveResultCode = response.getStatusLine().getStatusCode();
        showResultCode(isActiveResultCode);
        return isActiveResultCode == 200;
    }

    private void request(CookieStore cookieStore, String host) throws IOException
    {
        CloseableHttpClient client = HttpClients.custom()
                .setDefaultCookieStore(cookieStore)
                .build();
        HttpPost httpPost = new HttpPost(host + "/"+ jTextFieldUrl.getText());
        httpPost.setHeader("Content-Type", "text/xml");
        String xml = jTextAreaRequest.getText();
        HttpEntity entity = new ByteArrayEntity(xml.getBytes("UTF-8"));
        httpPost.setEntity(entity);
        HttpResponse response = client.execute(httpPost);
        String outResult = EntityUtils.toString(response.getEntity());
        int isActiveResultCode = response.getStatusLine().getStatusCode();
        showResultCode(isActiveResultCode);
        jTextAreaResponse.setText(XmlStringFormatter.toPrettyXmlString(4, outResult));
    }

    private  void logout(CookieStore cookieStore, String host) throws IOException
    {
        CloseableHttpClient client = HttpClients.custom()
                .setDefaultCookieStore(cookieStore)
                .build();
        HttpGet httpGet = new HttpGet(host + "/system/logout");
        HttpResponse response = client.execute(httpGet);
        int isActiveResultCode = response.getStatusLine().getStatusCode();
        showResultCode(isActiveResultCode);
    }
    private void showResultCode(int code){
        jTextFieldResultCode.setText("Code: "+code);
    }
}