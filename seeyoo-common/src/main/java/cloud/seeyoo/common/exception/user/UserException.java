package cloud.seeyoo.common.exception.user;

import cloud.seeyoo.common.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author yoo
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
