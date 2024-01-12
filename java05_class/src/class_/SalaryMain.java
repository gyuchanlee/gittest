package class_;

import java.text.DecimalFormat;

/**
 * 2023-12-28
 */
public class SalaryMain {

    public static void main(String[] args) {

        SalaryDTO[] dtos = new SalaryDTO[3];

        // for each문은 배열/리스트 값 추가/변경이 불가능!! > 기본적으로 배열의 요소를 복사해서 들고오기 때문에 원본에 저장이 되지 않음.
//        for (SalaryDTO dto : dtos) {
//            dto = new SalaryDTO();
//        }

        for (int i = 0; i < dtos.length; i++) {
            dtos[i] = new SalaryDTO();
        }

        dtos[0].setData("홍길동", "이사", 4800000, 300000);
        dtos[1].setData("송중기", "사원", 2000000, 100000);
        dtos[2].setData("아이유", "주임", 2900000, 150000);

        // 출력
        System.out.println("이름\t\t직급\t\t기본급\t\t\t 수당\t\t합계\t\t\t\t세율\t\t세금\t\t  월급");
        for (int i = 0; i < 4; i++) {
            System.out.print("----------------------");
        }
        System.out.println();
        DecimalFormat df = new DecimalFormat("#,###");

        for (SalaryDTO dto : dtos) {
            dto.calc();
            System.out.printf("%s\t%s \t%s\t\t%s\t\t%s\t\t%.2f\t%s\t  %s\n",
                    dto.getName(),
                    dto.getJob(),
                    df.format(dto.getBasic()),
                    df.format(dto.getExtra()),
                    df.format(dto.getTotal()),
                    dto.getRate(),
                    df.format(dto.getTax()),
                    df.format(dto.getSalary())
            );
        }


    }
}

/**
 * [문제] 월급 계산
 * 합계 = 기본급 + 수당
 * 세금 = 합계 * 세율
 * 월급 = 합계 - 세금
 *
 * [조건]
 * 1. 조건 연산자 이용
 * 합계가 5,000,000원 이상이면 3% (0.03)
 *      3,000,000원 이상이면 2% (0.02)
 *      아니면 1% (0.01)
 * 2. 숫자는 3자리마다 , 표시
 * 3. 소수이하는 표시하지 않는다. (정수형)
 *
 * 클래스명 : SalaryDTO
 * 필드 : name, job, basic, extra, total, rate, salary
 * 메소드 : setData(이름, 직급, 기본급, 수당)
 *        calc() - 합계, 세율, 월급 계산
 * 	   getName()
 * 	   getJob()
 * 	   getBasic()
 * 	   getExtra()
 *        getTotal()
 *        getRate()
 *        getSalary()
 *
 * 클래스명 : SalaryMain
 *
 * [실행결과]
 * 이름		직급		기본급			수당			합계		세율		월급
 * 홍길동		이사		4,800,000	300,000
 * 송중기		사원		2,000,000	100,000
 * 아이유		주임		2,900,000	150,000
 */