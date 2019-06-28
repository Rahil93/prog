import java.util.Scanner;

public class  TicTacToe{

  public static char[][] arr;
  public static int number = 3;

  public static void initArray(){
    arr = new char[number][number];
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number; j++) {
        arr[i][j] = '-';
      }
    }
  }

  public static void userEnter(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Row : ");
    int row = sc.nextInt();
    System.out.print("Enter Column : ");
    int column = sc.nextInt();
    if (row <= number && column <= number) {
      if (arr[row - 1][column - 1] == '-') {
        arr[row - 1][column -1] = 'X';
      }
      else if (arr[row - 1][column - 1] == 'X' || arr[row - 1][column - 1] == 'O') {
        System.out.println("Please Enter correct value...");
        userEnter();
      }
    }
    else {
      System.out.println("Please Enter correct value...");
      userEnter();
    }
  }

  public static void computerEnter(){
    int vcount;
    int hcount;
    int flag = 0;

    // Diagonal 1 For Computer(O)

    if (flag != 1) {
      int i  = 0;
      int j = 0;
      int d1count = 0;

      while (i < number && j < number) {
        if (arr[i][j] == 'O') {
          d1count++;
        }
        i++;
        j++;
      }
      if (d1count == 2) {
        i = 0;
        j = 0;
        while (i < number && j < number) {
          if (arr[i][j] == '-') {
            arr[i][j] = 'O';
            flag = 1;
            break;
          }
          if (flag == 1) {
            break;
          }
          i++;
          j++;
        }
      }
    }

    // Diagonal 1 For User(X)

    if (flag != 1) {
      int i  = 0;
      int j = 0;
      int d1count = 0;

      while (i < number && j < number) {
        if (arr[i][j] == 'X') {
          d1count++;
        }
        i++;
        j++;
      }
      if (d1count == 2) {
        i = 0;
        j = 0;
        while (i < number && j < number) {
          if (arr[i][j] == '-') {
            arr[i][j] = 'O';
            flag = 1;
            break;
          }
          if (flag == 1) {
            break;
          }
          i++;
          j++;
        }
      }
    }

    // Diagonal 2 for Computer(0)

    if (flag != 1) {
      int d2count = 0;
      int i = 0;
      int j = number - 1;
      while (i < number && j >= 0) {
        if (arr[i][j] == 'O') {
          d2count++;
        }
        i++;
        j--;
      }
      if (d2count == 2) {
        i = 0;
        j = number - 1;
        while (i < number && j >= 0) {
          if (arr[i][j] == '-') {
            arr[i][j] = 'O';
            flag = 1;
            break;
          }
          if (flag == 1) {
            break;
          }
          i++;
          j--;
        }
      }
    }

    // Diagonal 2 for User(X)

    if (flag != 1) {
      int d2count = 0;
      int i = 0;
      int j = number - 1;
      while (i < number && j >= 0) {
        if (arr[i][j] == 'X') {
          d2count++;
        }
        i++;
        j--;
      }
      if (d2count == 2) {
        i = 0;
        j = number - 1;
        while (i < number && j >= 0) {
          if (arr[i][j] == '-') {
            arr[i][j] = 'O';
            flag = 1;
            break;
          }
          if (flag == 1) {
            break;
          }
          i++;
          j--;
        }
      }
    }

    // Horizontal for computerEnter(O)

    if (flag != 1) {
			for (int m = 0; m < number; m++) {
				hcount = 0;
				for (int n = 0; n < number; n++) {
					if (arr[m][n] == 'O') {
						hcount++;
					}
					if (hcount == 2) {
						for (int i = m; i < number; i++) {
							for (int j = 0; j < number; j++) {
								if (arr[i][j] == '-') {
									arr[i][j] = 'O';
									flag = 1;
									break;
								}
								if (flag == 1) {
									break;
								}
							}
							if (flag == 1) {
								break;
							}
						}
					}
					if (flag == 1) {
						break;
					}
				}
				if (flag == 1) {
					break;
				}
			}
		}

    // Horizontal for computerEnter(O)

    if (flag != 1) {
			for (int m = 0; m < number; m++) {
				hcount = 0;
				for (int n = 0; n < number; n++) {
					if (arr[m][n] == 'O') {
						hcount++;
					}
					if (hcount == 2) {
						for (int i = m; i < number; i++) {
							for (int j = 0; j < number; j++) {
								if (arr[i][j] == '-') {
									arr[i][j] = 'O';
									flag = 1;
									break;
								}
								if (flag == 1) {
									break;
								}
							}
							if (flag == 1) {
								break;
							}
						}
					}
					if (flag == 1) {
						break;
					}
				}
				if (flag == 1) {
					break;
				}
			}
		}

    // Vertical for Computer(O)

    if (flag != 1) {
      for (int n = 0; n < number; n++) {
        vcount = 0;
        for (int m = 0; m < number; m++) {
          if (arr[m][n] == 'O') {
            vcount++;
          }
          if (vcount == 2) {
            for (int j = n; j < number; j++) {
              for (int i = 0; i < number; i++) {
                if (arr[i][j] == '-') {
                  arr[i][j] = 'O';
                  flag = 1;
                  break;
                }
                if (flag == 1) {
                  break;
                }
              }
              if (flag == 1) {
                break;
              }
            }
          }
          if (flag == 1) {
            break;
          }
        }
        if (flag == 1) {
          break;
        }
      }
    }

    // Vertical for User(X)

    if (flag != 1) {
      for (int n = 0; n < number; n++) {
        vcount = 0;
        for (int m = 0; m < number; m++) {
          if (arr[m][n] == 'X') {
            vcount++;
          }
          if (vcount == 2) {
            for (int j = n; j < number; j++) {
              for (int i = 0; i < number; i++) {
                if (arr[i][j] == '-') {
                  arr[i][j] = 'O';
                  flag = 1;
                  break;
                }
                if (flag == 1) {
                  break;
                }
              }
              if (flag == 1) {
                break;
              }
            }
          }
          if (flag == 1) {
            break;
          }
        }
        if (flag == 1) {
          break;
        }
      }
    }

    // Computer Input

    if (flag != 1) {
      for (int i = 0; i < number; i++) {
        for (int j = 0; j < number; j++) {
          if (arr[i][j] == '-') {
            arr[i][j] = 'O';
            flag = 1;
            break;
          }
          if (flag == 1) {
            break;
          }
        }
        if (flag == 1) {
          break;
        }
      }
    }
  }

  public static boolean victoryCheck(){
    int i;
		int j;
		int hcount;
		int vcount;
		int d1count;
		int d2count;

		for (int m = 0; m < number; m++) {
			hcount = 0;
			for (int n = 0; n < number; n++) {
				if (arr[m][n] == 'X') {
					hcount++;
				}
				if (hcount == number) {
					return true;
				}
			}
		}

		for (int n = 0; n < number; n++) {
			vcount = 0;
			for (int m = 0; m < number; m++) {
				if (arr[m][n] == 'X') {
					vcount++;
				}
				if (vcount == number) {
					return true;
				}
			}
		}

		i = 0;
		j = 0;
		d1count = 0;

		while (i < number && j < number) {
			if (arr[i][j] == 'X') {
				d1count++;
			}
			i++;
			j++;
		}

		i = 0;
		j = number - 1;
		d2count = 0;

		while (i < number && j >= 0) {
			if (arr[i][j] == 'X') {
				d2count++;
			}
			i++;
			j--;
		}
		return (d1count == number || d2count == number);
  }

  public static boolean computerVictoryCheck(){
		int i;
		int j;
		int hcount;
		int vcount;
		int d1count;
		int d2count;

		for (int m = 0; m < number; m++) {
			hcount = 0;
			for (int n = 0; n < number; n++) {
				if (arr[m][n] == 'O') {
					hcount++;
				}
				if (hcount == number) {
					return true;
				}
			}
		}

		for (int n = 0; n < number; n++) {
			vcount = 0;
			for (int m = 0; m < number; m++) {
				if (arr[m][n] == 'O') {
					vcount++;
				}
				if (vcount == number) {
					return true;
				}
			}
		}

		i = 0;
		j = 0;
		d1count = 0;

		while (i < number && j < number) {
			if (arr[i][j] == 'O') {
				d1count++;
			}
			i++;
			j++;
		}

		i = 0;
		j = number - 1;
		d2count = 0;

		while (i < number && j >= 0) {
			if (arr[i][j] == 'O') {
				d2count++;
			}
			i++;
			j--;
		}
		return (d1count == number || d2count == number);
	}

	public static boolean drawCheck(){
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (arr[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}

  public static void display(){
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    initArray();
		display();
		do {
			System.out.println();
			userEnter();
			if (victoryCheck()) {
				display();
				System.out.println("Hurrry...You Win...");
				break;
			}
			System.out.println();
			computerEnter();
			if (computerVictoryCheck()) {
				display();
				System.out.println("Ohhhh No....You Lose");
				break;
			}
			if (drawCheck()) {
				display();
				System.out.println("Haassh Draw.....");
				break;
			}
			System.out.println();
			display();
		} while (!victoryCheck() || !computerVictoryCheck() || !drawCheck());
    // userEnter();
    // display();
  }
}
