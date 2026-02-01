
import { logs } from "../data/log";

const Rating = () => {
   const filteredLogs = logs.filter((log) => log.carbon > 0);

    return (
        <div>
            <ul>
                {logs.map((log) => (
                    <li
                        key={log.id}
                        style={{
                            color: log.carbon > 3 ? "red" : "green",
                        }}
                    >
                        {log.activity} = {log.carbon} Kg
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default Rating;
