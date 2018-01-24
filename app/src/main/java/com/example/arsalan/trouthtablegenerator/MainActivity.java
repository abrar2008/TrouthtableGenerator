package com.example.arsalan.trouthtablegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b =(Button)findViewById(R.id.button);
    }
        String iS;
        Stack s;

    public void postfixe(View view) {
        EditText et = (EditText) findViewById(R.id.editText);
        iS = et.getText().toString();
        s = new Stack();
        String OutputString = "";

        boolean FI = false;

        for (int i = 0; i < iS.length(); i++) {
            char curChar = iS.charAt(i);

            if(s.isEmpty())
            {
                FI=false;
            }

            if (!isOperator(curChar)) {
                OutputString += Character.toString(curChar);

                if (i == iS.length() - 1) {
                    while (!s.empty()) {
                        OutputString += s.pop();
                    }
                }
            } else {
                if (FI) {
                    if (nigation(curChar) && AND((Character) s.peek())) {

                        s.push(curChar);
                        if (i == iS.length() - 1) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                   else if (nigation(curChar) && OR((Character) s.peek())) {
                        s.push(curChar);
                        if (i == iS.length() - 1) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                   else if (nigation(curChar) && Implication((Character) s.peek())) {
                        s.push(curChar);
                        if (i == iS.length() - 1) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if (AND(curChar) && nigation((Character) s.peek())) {
                        OutputString += s.pop();
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if (AND(curChar) && OR((Character) s.peek())) {
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if (AND(curChar) && Implication((Character) s.peek())) {
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if (OR(curChar) && nigation((Character) s.peek())) {
                        OutputString += s.pop();
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    } else if (OR(curChar) && AND((Character) s.peek())) {
                        OutputString += s.pop();
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }
                    else if (OR(curChar) && Implication((Character) s.peek())) {
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }

                    else if (Implication(curChar) && nigation((Character) s.peek())) {
                        OutputString += s.pop();
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }
                    else if (Implication(curChar) && AND((Character) s.peek())) {
                        OutputString += s.pop();
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }
                    else if (Implication(curChar) && OR((Character) s.peek())) {
                        OutputString += s.pop();
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }
                    else if (OR(curChar) && (Character) s.peek() == '(') {
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }
                    else if (AND(curChar) && (Character) s.peek() == '(') {
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }
                    else if (OR(curChar) && (Character) s.peek() == '(') {
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }
                    else if (Implication(curChar) && (Character) s.peek() == '(') {
                        s.push(curChar);

                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }

                    }
                    else if ((Character)s.peek() == '(') {
                        s.push(curChar);
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }

                    else if ((Character)s.peek() == '(' &&  nigation(curChar)){
                        s.push(curChar);
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }

                    else if ((Character)s.peek() == '(' &&  AND(curChar)){
                        s.push(curChar);
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if ((Character)s.peek() == '(' &&  OR(curChar)){
                        s.push(curChar);
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if ((Character)s.peek() == '(' &&  Implication(curChar)){
                        s.push(curChar);
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if (curChar == ')' && nigation((Character) s.peek())) {
                        while ((Character) s.peek() != '(') {
                            if (curChar != '(' || curChar != ')') {
                                OutputString += s.pop();
                            }
                        }
                        if ((Character) s.peek() == '(') {
                            s.pop();
                        }
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if (curChar == ')' && AND((Character) s.peek())) {
                        while ((Character) s.peek() != '(') {
                            if (curChar != '(' || curChar != ')') {
                                OutputString += s.pop();
                            }
                        }
                        if ((Character) s.peek() == '(') {
                            s.pop();
                        }
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if (curChar == ')' && OR((Character) s.peek())) {
                        while ((Character) s.peek() != '(') {
                            if (curChar != '(' || curChar != ')') {
                                OutputString += s.pop();
                            }
                        }
                        if ((Character) s.peek() == '(') {
                            s.pop();
                        }
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }
                    else if (curChar == ')' && Implication((Character) s.peek())) {

                        while ((Character) s.peek() != '(')
                        {
                            OutputString += s.pop();
                        }
                        if ((Character) s.peek() == '(') {
                            s.pop();
                        }
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    } else {
                        OutputString += Character.toString(curChar);
                        if (i == (iS.length() - 1)) {
                            while (!s.empty()) {
                                OutputString += s.pop();
                            }
                        }
                    }


                } else {
                    s.push(curChar);
                    FI = true;


                    if (i == (iS.length() - 1)) {
                        while (!s.empty()) {
                            OutputString += s.pop();
                        }
                    }
                }

            }
        }

        et.setText(OutputString);
        Stack s=new Stack();
        int j=0;
        String Outputag="";
        char f;
        String l="";
        char[] result=new char[4];
        result[0]='0';
        char[] A=new char[]{'T','T','F','F'};
        char[] B=new char[]{'T','F','T','F'};
        for (int i=0;i<OutputString.length();i++) {
            char ch = OutputString.charAt(i);
            if (isOperator(ch)== false)
            {
                 s.push(ch);
            }
            else if(isOperator(ch)== true)
            {
                if(ch=='n')
                {
                    f=(Character)s.pop();
                    if(f == 'A')
                    {
                    while (j<A.length)
                    {
                        if(A[j]=='T')
                        {
                            result[j]='F';
                        }
                        else{
                            result[j]='T';
                        }
                        j++;
                    }

                    }
                    else if(f == 'B')
                    {
                        while (j<B.length)
                        {
                            if(B[j]=='T')
                            {
                                result[j]='F';
                            }
                            else{
                                result[j]='T';
                            }
                            j++;
                        }

                    }

                }else if(ch=='a')
                {
                    f= (Character)s.pop();

                    String a="0";
                    j=0;
                    if(result[0]!='0')
                    {
                        if(f=='A')
                        {
                            while (j<A.length)
                            {
                                if(A[j]=='T' && result[j]== 'T')
                                {
                                    result[j]='T';
                                }else{
                                    result[j]='F';
                                }
                                j++;
                            }
                        }else if(f=='B')
                        {
                            while (j<A.length)
                            {
                                if(B[j]=='T' && result[j]== 'T')
                                {
                                    result[j]='T';
                                }else{
                                    result[j]='F';
                                }
                                j++;
                            }
                        }
                    }
                    else
                    {
                        l=s.pop().toString();
                        j=0;
                        if(f=='A')
                        {
                            while (j<A.length)
                            {
                                if(A[j]=='T' && B[j]== 'T')
                                {
                                    result[j]='T';
                                }else{
                                    result[j]='F';
                                }
                                j++;
                            }
                        }else if(f=='B')
                        {
                            while (j<A.length)
                            {
                                if(B[j]=='T' && A[j]== 'T')
                                {
                                    result[j]='T';
                                }else{
                                    result[j]='F';
                                }
                                j++;
                            }
                        }

                    }}
                //.........................................................
                    else if(ch=='o')
                {
                    f= (Character)s.pop();

                    String a="0";
                    j=0;
                    if(result[0]!='0')
                    {
                        if(f=='A')
                        {
                            while (j<A.length)
                            {
                                if(A[j]=='T' || result[j]== 'T')
                                {
                                    result[j]='T';
                                }else{
                                    result[j]='F';
                                }
                                j++;
                            }
                        }else if(f=='B')
                        {
                            while (j<A.length)
                            {
                                if(B[j]=='T' || result[j]== 'T')
                                {
                                    result[j]='T';
                                }else{
                                    result[j]='F';
                                }
                                j++;
                            }
                        }
                    }
                    else
                    {
                        l=s.pop().toString();
                        j=0;
                        if(f=='A')
                        {
                            while (j<A.length)
                            {
                                if(A[j]=='T' || B[j]== 'T')
                                {
                                    result[j]='T';
                                }else{
                                    result[j]='F';
                                }
                                j++;
                            }
                        }else if(f=='B')
                        {
                            while (j<A.length)
                            {
                                if(B[j]=='T' || A[j]== 'T')
                                {
                                    result[j]='T';
                                }else{
                                    result[j]='F';
                                }
                                j++;
                            }
                        }

                    }}
                    //......................................................
                else if(ch=='i')
                {
                    f= (Character)s.pop();

                    String a="0";
                    j=0;
                    if(result[0]!='0')
                    {
                        if(f=='A')
                        {
                            while (j<A.length)
                            {
                                if(A[j]=='F' && result[j]== 'T')
                                {
                                    result[j]='F';
                                }else{
                                    result[j]='T';
                                }
                                j++;
                            }
                        }else if(f=='B')
                        {
                            while (j<A.length)
                            {
                                if(B[j]=='F' && result[j]== 'T')
                                {
                                    result[j]='F';
                                }else{
                                    result[j]='T';
                                }
                                j++;
                            }
                        }
                    }
                    else
                    {
                        l=s.pop().toString();
                        j=0;
                        if(f=='A')
                        {
                            while (j<A.length)
                            {
                                if(A[j]=='F' && B[j]== 'T')
                                {
                                    result[j]='F';
                                }else{
                                    result[j]='T';
                                }
                                j++;
                            }
                        }else if(f=='B')
                        {
                            while (j<A.length)
                            {
                                if(B[j]=='F' && A[j]== 'T')
                                {
                                    result[j]='F';
                                }else{
                                    result[j]='T';
                                }
                                j++;
                            }
                        }

                    }
                    ////////////////////////////////////////////////////////////
                }


            }
        }


 int x=0;
    while (x<result.length)
    {
        Outputag = Outputag + " " +result[x];
        x++;
    }
     b.setText(Outputag);

    }


    public boolean isOperator(char op) {
        switch (op) {
            case 'n':
                return true;
            case 'a':
                return true;
            case 'o':
                return true;
            case 'i':
                return true;
            case '(':
                return true;
            case  ')':
                return true;
            default:
                return false;
        }
    }

    public boolean nigation(char op) {
        switch (op) {
            case 'n':
                return true;
            default:
                return false;
        }
    }

    public boolean AND(char op) {
        switch (op) {
            case 'a':
                return true;
            default:
                return false;
        }
    }

    public boolean OR(char op) {
        switch (op) {
            case 'o':
                return true;
            default:
                return false;
        }
    }

    public boolean Implication(char op) {
        switch (op) {
            case 'i':
                return true;
            default:
                return false;
        }
    }
}

