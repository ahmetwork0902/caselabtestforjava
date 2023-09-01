SELECT surname
FROM (
    SELECT surname, experience,
           RANK() OVER (ORDER BY experience DESC) AS rank
    FROM employees
) ranked
WHERE rank = 2;
