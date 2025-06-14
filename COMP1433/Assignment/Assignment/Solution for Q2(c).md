# Solution for Q2(c)

$$
Y=ln(X)\\
Let\ F(x) \ be \ the \ CDF\ of \ x\\
F(y)=F(ln(x))\\
\frac {dF(ln(x))}{dy}=\frac {dF(ln(x))}{dlnx}=xF'(x)=F'(y)\\
xf(x)=f(y)=\frac{1}{\sigma\sqrt{2\pi}}e^{-\frac{(y-\mu)^2}{2\sigma^2}}\\
f(x)=\frac{1}{x\sigma\sqrt{2\pi}}e^{-\frac{(ln(x)-\mu)^2}{2\sigma^2}}\\
$$

So we can obtain the PDF of $x$ is $f(x)=\frac{1}{x\sigma\sqrt{2\pi}}e^{-\frac{(ln(x)-\mu)^2}{2\sigma^2}}$
$$
\begin{align}

E(x)&=\int_{0}^{+\infin}xf(x)dx=\int_{0}^{+\infin}\frac{1}{\sigma\sqrt{2\pi}}e^{-\frac{(ln(x)-\mu)^2}{2\sigma^2}}dx\\
&Let\ t=\frac{ln(x)-\mu}{\sqrt2\sigma},\ then \ x=e^{\sqrt2\sigma t+\mu}\\
E(x)&=\frac{1}{\sigma\sqrt{2\pi}}\int_{-\infin}^{+\infin}e^{-t^2}de^{\sqrt2\sigma t+\mu}\\
&=\frac{e^\mu}{\sqrt{\pi}}\int_{-\infin}^{+\infin}e^{-t^2+\sqrt2\sigma t}dt\\
&=\frac{e^{\mu+\frac{\sigma^2}{2}}}{\sqrt{\pi}}\int_{-\infin}^{+\infin}e^{-(t-\frac{\sqrt2\sigma}{2})^2}dt\\
&Let\ u= t-\frac{\sqrt2\sigma}{2},\ then\ t=u+\frac{\sqrt2\sigma}{2}\\
E(x)&=\frac{e^{\mu+\frac{\sigma^2}{2}}}{\sqrt{\pi}}\int_{-\infin}^{+\infin}e^{-u^2}du\\
&As\ \int_{-\infin}^{+\infin}e^{-u^2}du=\sqrt{\pi}\\
E(x)&=e^{\mu+\frac{\sigma^2}{2}}
\end{align}
$$
As $V(x)=E(x^2)-(E(x))^2$, we need to calculate $E(x^2)$:
$$
\begin{align}
E(x^2)&=\int_{0}^{+\infin}x^2f(x)dx=\int_{0}^{+\infin}\frac{x}{\sigma\sqrt{2\pi}}e^{-\frac{(ln(x)-\mu)^2}{2\sigma^2}}dx\\
&With\ the\ similar\ substitution\ of\ t \ as\ above.\\
E(x^2)&=\frac{1}{\sigma\sqrt{2\pi}}\int_{-\infin}^{+\infin}e^{-t^2+\sqrt2\sigma t+\mu}de^{\sqrt2\sigma t+\mu}\\
&=\frac{e^{2\mu}}{\sqrt{\pi}}\int_{-\infin}^{+\infin}e^{-t^2+2\sqrt2\sigma t}dt\\
&=\frac{e^{2\mu+2\sigma^2}}{\sqrt{\pi}}\int_{-\infin}^{+\infin}e^{-(t-\sqrt2\sigma)^2}dt\\
&Let\ v= t-\sqrt2\sigma,\ then\ t=v+\sqrt2\sigma\\
E(x^2)&=\frac{e^{2\mu+2\sigma^2}}{\sqrt{\pi}}\int_{-\infin}^{+\infin}e^{-v^2}dv=e^{2\mu+2\sigma^2}\\
\end{align}
$$
So, $V(x)=e^{2\mu+2\sigma^2}-e^{2\mu+\sigma^2}=e^{2\mu+\sigma^2}(e^{\sigma^2}-1)$.

| Number of Samples | Mean     | Variance |
| ----------------- | -------- | -------- |
| 10                | 1.02129  | 0.000517 |
| 100               | 1.013513 | 0.002671 |
| 1000              | 1.020112 | 0.002591 |
| 10000             | 1.021758 | 0.002548 |
| 100000            | 1.021626 | 0.002611 |
| Theoretical       | 1.021477 | 0.002619 |

With the number of samples increasing, the empirical means and variances are closer to the theoretical value.
