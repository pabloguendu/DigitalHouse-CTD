import styles from '../styles/Card.module.css'
const Card = ({name,image,price})=>{
    return(
    <ul className={styles.container}>
        <li>
          <h2>{name}</h2>
          <img className={styles.img} src={image} />
          <h3>{price}</h3>
        </li>
    </ul>

)}
export default Card;