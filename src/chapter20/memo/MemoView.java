package chapter20.memo;

import java.util.List;
import java.util.Scanner;

public class MemoView {
	public void init(MemoController controller) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Program: while (true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.��� | 2.��� | 3. ���� | 4. ���� | 5. ����");
			System.out.println("-----------------------------------------");
			System.out.print("�޴��� �����ϼ���> ");
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				// ���
				List<MemoVO> memos = controller.getMemos();
				System.out.println("-----------------------------------------");
				System.out.println("ID \t ���� \t ���� \t ������� \t ��������");
				System.out.println("-----------------------------------------");
				for (MemoVO vo : memos) {
					System.out.println(vo);
				}
				break;
			case 2:
				// ���
				System.out.print("���� ");
				String title = scanner.nextLine();
				System.out.print("���� ");
				String contents = scanner.nextLine();
				int insertMemo = controller.insertMemo(new MemoVO(title, contents));
				if(insertMemo ==1) {
					System.out.println("��� ����!");
				} else {
					System.out.println("��� ����!");
				}
				break;
			case 3:
				// ����
				System.out.println("������ �޸� ��ȣ: ");
				int searchId = Integer.parseInt(scanner.nextLine());  //�ظ��ϸ� ��ĳ�ʴ� ���ڷιް� ������ �Ľ��� ����.
				System.out.print("���� ");
				String updateTitle = scanner.nextLine();
				System.out.print("���� ");
				String updateContents = scanner.nextLine();
				int updateMemo = controller.updateMemo(new MemoVO(searchId, updateTitle, updateContents));
				if (updateMemo == 1) {
					System.out.println("���� ����!");
				} else {
					System.out.println("���� ����!");
				}
				break;
			case 4:
				// ����
				System.out.print("������ �޸� ��ȣ: ");
				int deleteId = Integer.parseInt(scanner.nextLine());
				int deleteMemo = controller.deleteMemo(deleteId);
				if(deleteMemo ==1) {
					System.out.println("���� ����!");
				} else {
					System.out.println("���� ����!");
				}
				break;
			case 5:
				// ����
				System.out.println("���α׷� ����");
				break Program;
			}
		}
		scanner.close();
	}
}
