package org.thunlp.text.classifiers;
import org.thunlp.language.chinese.WordSegment;
import org.thunlp.language.english.BilingualBigramWordSegment;

/**
 * @ClassName: LinearBigramChineseTextClassifier
 * @Author: yangyang.wang
 * @Date:
 * @Version: 1.0
 * @Description:
 *
 **/
public class LinearBigramChineseTextClassifier extends LiblinearTextClassifier{

  public LinearBigramChineseTextClassifier(int nclasses) {
    super(nclasses);
  }
  
  public LinearBigramChineseTextClassifier(int nclasses, WordSegment seg ) {
    super(nclasses, seg);
  }

  @Override
  protected WordSegment initWordSegment() {
    return new BilingualBigramWordSegment();
  }
  
}
