package homework;

import java.util.Scanner;

/**
 * 2023-12-29
 * 
 * 비즈니스 로직 처리
 */
public class MemberService {

    private MemberDTO[] arr = new MemberDTO[5];

    public void menu() {
        while (true) {
            System.out.println("*************");
            System.out.println("    1. 가입");
            System.out.println("    2. 출력");
            System.out.println("    3. 수정");
            System.out.println("    4. 탈퇴");
            System.out.println("    5. 끝내기");
            System.out.println("*************");
            System.out.print("    번호 : ");

            int menuSelect;
            Scanner scn = new Scanner(System.in);
            try {
                menuSelect = scn.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력!!!");
                continue;
            }

            if (menuSelect == 1) {
                insert(scn);
            } else if (menuSelect == 2) {
                list();
            } else if (menuSelect == 3) {
                update(scn);
            } else if (menuSelect == 4) {
                delete(scn);
            } else if (menuSelect == 5) {
                break;
            } else {
                System.out.println("1 - 5번까지 숫자에서 고르세요!!!");
            }

            System.out.println();
        }

    }

    /**
     *  * 이름 입력 :
     *  * 나이 입력 :
     *  * 핸드폰 입력 :
     *  * 주소 입력 :
     *  *
     *  * 1 row created
     *  * [] 명 정원이 남았습니다.
     */
    public void insert(Scanner scn) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.print(" 이름 입력 :");
                String name = scn.next();
                System.out.print(" 나이 입력 :");
                Integer age = scn.nextInt();
                System.out.print(" 핸드폰 입력 :");
                String phone = scn.next();
                System.out.print(" 주소 입력 :");
                String address = scn.next();

                arr[i] = new MemberDTO(name, age, phone, address);
                System.out.println(" 1 row created");
                break;
            }
        }

        int cnt = 0;
        for (MemberDTO data : arr) {
            if (data == null) {
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("5명의 정원이 꽉 찼습니다...");
        } else {
            System.out.printf("[%d] 명 정원이 남았습니다.", cnt);
        }
    }

    public void list() {
        System.out.println(" 이름\t\t나이\t\t핸드폰\t\t주소");
        boolean isBlank = false; // false = 비어있음 가정.
        for (MemberDTO member : arr) {
            if (member == null) {
                continue;
            }
//            System.out.printf(" %s\t\t%d\t\t%s\t\t%s\n",
//                    member.getName(),
//                    member.getAge(),
//                    member.getPhone(),
//                    member.getAddress()
//            );
            System.out.println(
                    member
            );
            isBlank = true;
        }

        if (!isBlank) {
            System.out.println("비어 있음!!");
        }
    }

    /**
     *  * update()
     *  * 핸드폰 번호 입력 : 010-123-1234
     *  * 홍길동		25		xxx		xxx
     *  *
     *  * 수정 할 이름 입력 :
     *  * 수정 할 핸드폰 입력 :
     *  * 수정 할 주소 입력 :
     *  *
     *  * 1 row(s) updated
     *  *
     *  * 또는
     *  *
     *  * 핸드폰 번호 입력 : 010-123-1235
     *  * 찾는 회원이 없습니다
     */
    public void update(Scanner scn) {
        System.out.print(" 핸드폰 번호 입력 : ");
        String findPhone = scn.next();

        boolean isPresent = false;
        for (MemberDTO member : arr) {
            if (member == null) {
                continue;
            }
            if (findPhone.equals(member.getPhone())) {
                System.out.printf(" %s\t\t%d\t\t%s\t\t%s\n",
                        member.getName(),
                        member.getAge(),
                        member.getPhone(),
                        member.getAddress()
                );
                isPresent = true;

                System.out.print("수정 할 이름 입력 : ");
                String reName = scn.next();
                System.out.print("수정 할 핸드폰 입력 : ");
                String rePhone = scn.next();
                System.out.print("수정 할 주소 입력 : ");
                String reAddress = scn.next();

                member.setName(reName);
                member.setPhone(rePhone);
                member.setAddress(reAddress);

                System.out.println(" 1 row(s) updated");
            }
        }
        if (!isPresent) {
            System.out.println("찾는 회원이 없습니다.");
        }
    }

    /**
     * [4번 경우]
     *  * delete()
     *  * 핸드폰 번호 입력 :
     *  * 1 row deleted
     *  * [] 명 정원이 남았습니다.
     *  *
     *  * 또는
     *  *
     *  * 핸드폰 번호 입력 :
     *  * 찾는 회원이 없습니다
     */
    public void delete(Scanner scn) {
        System.out.print(" 핸드폰 번호 입력 : ");
        String findPhone = scn.next();

        boolean isPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (findPhone.equals(arr[i].getPhone())) {
                isPresent = true;
                arr[i] = null;
                System.out.println(" 1 row deleted");
            }
        }
        if (!isPresent) {
            System.out.println("찾는 회원이 없습니다.");
        }
    }
}
