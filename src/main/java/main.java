import lotto.BonusBall;
import lotto.Lottos;
import lotto.ManualLotto;
import lotto.WinningNumbers;
import view.InputView;
import view.OutputView;

public class main {

  public static void main(String[] args) {
    OutputView.purchasePrice();
    Lottos lottos = new Lottos();
    int purchaseAmount = InputView.getIntValue(); InputView.getStringValue(); // Scanner에 enter가 남아있어 enter를 먹어 없애기 위한 코드

    OutputView.manualPurchaseCount();
    int manualPurchaseAmount= InputView.getIntValue(); InputView.getStringValue(); // Scanner에 enter가 남아있어 enter를 먹어 없애기 위한 코드

    lottos.buyAutoLotto(purchaseAmount, manualPurchaseAmount);

    OutputView.manualPurchaseLottoNumbers();
    for (int i = 0; i < manualPurchaseAmount; i++) {
      lottos.addManualLotto(new ManualLotto(InputView.getStringValue()));
    }

    OutputView.lottos(lottos);

    OutputView.lastWeekWinningNumber();
    WinningNumbers winningNumbers = new WinningNumbers(InputView.getStringValue());

    OutputView.bonusBall();
    OutputView.statistics(lottos.findWinner(winningNumbers, new BonusBall(winningNumbers, InputView.getIntValue())));
  }
}
