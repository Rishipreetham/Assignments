//Print INEURON

public class Pattern1 {
    public static void main(String args[])
    {
        //I

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j==0)
                System.out.print("*"+" ");
                else
                    System.out.print("  ");

            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");

        // N

        for(int i=0;i<5;i++)
        {
            if(i==0||i==4)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                System.out.println(" ");
            }

            else if (i==1)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==1||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                System.out.println(" ");
            }
            else if (i==2)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==2||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                System.out.println(" ");
            }
            else if (i==3)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==3||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                System.out.println(" ");
            }
        }

        System.out.println(" ");
        System.out.println(" ");

        //E

        for(int i=0;i<5;i++)
        {
            if(i==0||i==2||i==4)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println(" ");
            }
            else
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        //U


        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    if (j == 0 || j == 4) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
        }

        System.out.println(" ");
        System.out.println(" ");

        //R
        for(int i=0;i<5;i++) {
            if(i==0)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println(" ");
            }
            else if(i==1||i==3)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==3)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
            else if (i==2)
            {
                for (int j=0;j<5;j++)
                {
                    if(j==0||j==1||j==2)
                    System.out.print("*"+" ");
                    else
                        System.out.print(" ");
                }
                System.out.println(" ");

            }
            else
            {
                for (int j=0;j<5;j++)
                {
                    if(j==0||j==4)
                    System.out.print("*"+" ");
                    else
                        System.out.print("  ");
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        //O

        for(int i=0;i<5;i++)
        {
            if(i==0 || i==4)
            {
                for (int j=0;j<5;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println(" ");
            }
            else {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println(" ");
            }
        }

        System.out.println(" ");
        System.out.println(" ");

        //N

        for(int i=0;i<5;i++)
        {
            if(i==0||i==4)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                System.out.println(" ");
            }

            else if (i==1)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==1||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                System.out.println(" ");
            }
            else if (i==2)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==2||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                System.out.println(" ");
            }
            else if (i==3)
            {
                for(int j=0;j<5;j++)
                {
                    if(j==0||j==3||j==4)
                    {
                        System.out.print("*"+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                System.out.println(" ");
            }
        }



    }
}
