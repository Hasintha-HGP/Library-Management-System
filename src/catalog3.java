import javax.swing.JOptionPane;

    public class catalog3 {
        String NameOfTheBook;
        String BookID;


        public catalog3(String nameOfTheBook, String bookID) {
            NameOfTheBook = nameOfTheBook;
            BookID = bookID;
        }

        public String getNameOfTheBook() {
            return NameOfTheBook;
        }

        public String getBookID() {
            return BookID;
        }

        @Override
        public String toString() {
            return
                    NameOfTheBook+"------------------>"+BookID;
        }
        public static void main() {
            catalog3 ob1=new catalog3("In Cold Blood","E001");
            catalog3 ob2=new catalog3("The Devil In The White City","E002");
            catalog3 ob3=new catalog3("The Innocent Man","E003");
            catalog3 ob4=new catalog3("Dark Star Safari","B001");
            catalog3 ob5=new catalog3("Blue Highways","B002");
            catalog3 ob6=new catalog3("Arabian Sands","B003");
            catalog3 ob7=new catalog3("Down Under","B004");
            catalog3 ob8=new catalog3("The Art Of Travel","B005");
            catalog3 ob9=new catalog3("Yakada Yaka","D001");
            catalog3 ob10=new catalog3("Song Of The Sun God","D002");
            catalog3 ob11=new catalog3("Senkottan","D003");
            catalog3 ob12=new catalog3("Kaliyugaya","D004");
            catalog3 ob13=new catalog3("Madolduuwa","D005");
            catalog3 ob14=new catalog3("Dune","C001");
            catalog3 ob15=new catalog3("Nineteen Eighty Four","C002");
            catalog3 ob16=new catalog3("Neuromancer","C003");
            catalog3 ob17=new catalog3("Childhood's End","C004");
            catalog3 ob18=new catalog3("Rendezvous With Rama","C005");
            catalog3 ob19=new catalog3("Essays Of A Lifetime","A001");
            catalog3 ob20=new catalog3("Woolf In Ceylon","A002");
            catalog3 ob21=new catalog3("A Beautiful Mind","A003");
            catalog3 ob22=new catalog3("Into The Wild","A004");
            catalog3 ob23=new catalog3("Mad Girl's Love Song","A005");
            int i=Integer.parseInt(JOptionPane.showInputDialog(null,"Please select your Choice >>>>>\n1-Title\n2-Author\n\n","Welcome to Catalog!!!",JOptionPane.PLAIN_MESSAGE));
            switch (i){
                case 1:
                    //JOptionPane.showMessageDialog(null,"Your choice is Title!!");
                    JOptionPane.showMessageDialog(null,"1-True Crime\n2-Travel Literature\n3-Novel\n4-Science Fiction\n5-Biography","-Titles-",JOptionPane.PLAIN_MESSAGE);
                    break;

                case 2:
                    //JOptionPane.showMessageDialog(null,"Your choice is Author!!");
                    JOptionPane.showMessageDialog(null,"1-Arthur C. Clarke\n2-Martin Wickramasinghe\n3-Mahinda Massibule\n4-Carlo Fonseka\n5-Truman Capote\n6-Erik Larson\n7-John Grisham-","-Authors-",JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Invalid Input");
                    break;
            }
            if (i==1){
            int name=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Title Number:","Input Pending...",JOptionPane.PLAIN_MESSAGE));

            switch (name) {
                case 1:
                    JOptionPane.showMessageDialog(null,""+ob1+"\n"+ob2+"\n"+ob3,"Catalog: True Crime",JOptionPane.PLAIN_MESSAGE);
                    //JOptionPane.showMessageDialog(null, ob2);
                   // JOptionPane.showMessageDialog(null, ob3);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,""+ob4+"\n"+ob5+"\n"+ob6+"\n"+ob7+"\n"+ob8,"Catalog: Travel Literature",JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,""+ob9+"\n"+ob10+"\n"+ob11+"\n"+ob12+"\n"+ob13,"Catalog: Novels",JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,""+ob14+"\n"+ob15+"\n"+ob16+"\n"+ob17+"\n"+ob18,"Catalog: Science Fiction",JOptionPane.PLAIN_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,""+ob19+"\n"+ob20+"\n"+ob21+"\n"+ob22+"\n"+ob23,"Catalog: Biography",JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Sorry!!\nNo related Books Found!!");
            }
            }
            else{
                int name=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Author Number:","Input Pending...",JOptionPane.PLAIN_MESSAGE));

                switch (name) {
                    case 1:
                        JOptionPane.showMessageDialog(null,""+ob17+"\n"+ob18,"Catalog: Arthur C. Clarke",JOptionPane.PLAIN_MESSAGE);
                        //JOptionPane.showMessageDialog(null, ob3);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,""+ob12+"\n"+ob13,"Catalog: Martin Wickramasinghe",JOptionPane.PLAIN_MESSAGE);
                        //JOptionPane.showMessageDialog(null, ob6);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,""+ob11,"Catalog: Mahinda Massibule",JOptionPane.PLAIN_MESSAGE);
                        //JOptionPane.showMessageDialog(null, ob2);
                        //JOptionPane.showMessageDialog(null, ob3);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,""+ob19,"Catalog: Carlo Fonseka",JOptionPane.PLAIN_MESSAGE);
                        //JOptionPane.showMessageDialog(null, ob2);
                        //JOptionPane.showMessageDialog(null, ob3);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,""+ob1,"Catalog: Truman Capot",JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,""+ob2,"Catalog:Erik Larson ",JOptionPane.PLAIN_MESSAGE);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,""+ob3,"Catalog:John Grisham ",JOptionPane.PLAIN_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Sorry!!\nNo related Books Found!!");
                        break;
                }
            }
        }
    }


