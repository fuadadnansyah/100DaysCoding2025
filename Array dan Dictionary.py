# Daftar siswa disimpan dalam bentuk LIST
# Tiap siswa direpresentasikan sebagai DICTIONARY
siswa = [
    {"nama": "Fuad", "kelas": "Kelas A Sisfo", "nilai": 85},
    {"nama": "Aisyah", "kelas": "Kelas A Sisfo", "nilai": 90},
    {"nama": "Rizky", "kelas": "Kelas A Sisfo", "nilai": 78}
]

# Menampilkan semua data siswa
print("=== Daftar Nilai Siswa Kelas A Sisfo ===")
for data in siswa:
    print(f"Nama: {data['nama']}, Kelas: {data['kelas']}, Nilai: {data['nilai']}")

# Menambahkan data baru ke dalam list
siswa.append({"nama": "Dewi", "kelas": "Kelas A Sisfo", "nilai": 88})

print("\nSetelah menambahkan data baru:")
for data in siswa:
    print(f"Nama: {data['nama']}, Kelas: {data['kelas']}, Nilai: {data['nilai']}")

# Menghitung rata-rata nilai siswa
total = 0
for data in siswa:
    total += data["nilai"]

rata_rata = total / len(siswa)
print(f"\nRata-rata nilai siswa: {rata_rata:.2f}")
