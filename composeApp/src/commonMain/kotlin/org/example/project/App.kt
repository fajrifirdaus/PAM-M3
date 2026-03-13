package org.example.project

import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import pamtugas3.composeapp.generated.resources.Res
import pamtugas3.composeapp.generated.resources.foto_profil

// ==========================================
// PROFESSIONAL LIGHT COLOR PALETTE
// ==========================================
private val BluePrimary   = Color(0xFF2563EB) // Blue 600
private val BlueDark      = Color(0xFF1E40AF) // Blue 800
private val SlateText     = Color(0xFF1E293B) // Slate 900
private val SlateSub      = Color(0xFF64748B) // Slate 500
private val BgSoft        = Color(0xFFF8FAFC) // Slate 50
private val BorderColor   = Color(0xFFE2E8F0) // Slate 200

private val ProfessionalTheme = lightColorScheme(
    primary = BluePrimary,
    background = BgSoft,
    surface = Color.White,
    onBackground = SlateText,
    onSurface = SlateText,
    outline = BorderColor
)

@Composable
@Preview
fun App() {
    var showContactInfo by remember { mutableStateOf(false) }

    MaterialTheme(colorScheme = ProfessionalTheme) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ProfileHeader(
                    name = "Muhammad Fajri Firdaus",
                    subtitle = "NIM: 123140050 | Informatika ITERA",
                    bio = "Mahasiswa Teknik Informatika yang sedang mengambil matakuliah Pengembangan Aplikasi Mobile, Temu Kembali Informasi, dan Penambangan Data."
                )

                Spacer(modifier = Modifier.height(32.dp))

                // Tombol Kontak dengan gaya Modern Minimalis
                Button(
                    onClick = { showContactInfo = !showContactInfo },
                    modifier = Modifier
                        .width(220.dp)
                        .height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp)
                ) {
                    Text(
                        if (showContactInfo) "Tutup Informasi" else "Tampilkan Kontak",
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.5.sp
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Animasi Transisi Halus
                AnimatedVisibility(
                    visible = showContactInfo,
                    enter = fadeIn() + expandVertically(),
                    exit = fadeOut() + shrinkVertically()
                ) {
                    ContactCard()
                }
            }
        }
    }
}

@Composable
fun ProfileHeader(name: String, subtitle: String, bio: String) {
    // Gradient Banner yang sangat halus (Profesional)
    val headerGradient = Brush.verticalGradient(
        colors = listOf(BlueDark, BluePrimary)
    )

    Box(
        modifier = Modifier.fillMaxWidth().wrapContentHeight(),
        contentAlignment = Alignment.TopCenter
    ) {
        // Banner Atas
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(headerGradient)
        )

        Column(
            modifier = Modifier.padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Foto Profil dengan Double Border Putih-Biru
            Image(
                painter = painterResource(Res.drawable.foto_profil),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(130.dp)
                    .clip(CircleShape)
                    .border(4.dp, Color.White, CircleShape)
                    .border(5.dp, BorderColor, CircleShape)
                    .background(Color.White),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Nama (Slate Text)
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                color = SlateText,
                textAlign = TextAlign.Center
            )

            // Subtitle (Blue Primary)
            Text(
                text = subtitle,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = BluePrimary,
                letterSpacing = 0.5.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Bio (Slate SubText)
            Text(
                text = bio,
                fontSize = 14.sp,
                color = SlateSub,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp),
                lineHeight = 22.sp
            )
        }
    }
}

@Composable
fun ContactCard() {
    // Card dengan sudut melengkung halus dan elevasi rendah (Clean Look)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
            .border(1.dp, BorderColor, RoundedCornerShape(16.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Contact Details",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = SlateText
            )

            // Divider yang sangat tipis
            HorizontalDivider(thickness = 1.dp, color = BorderColor)

            InfoItem(icon = Icons.Default.Email, title = "Email", text = "muhammad.123140050@student.itera.ac.id")
            InfoItem(icon = Icons.Default.Phone, title = "Phone", text = "+62 899-3368-339")
            InfoItem(icon = Icons.Default.LocationOn, title = "Location", text = "Palembang, Indonesia")
        }
    }
}

@Composable
fun InfoItem(icon: ImageVector, title: String, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        // Container Ikon yang Clean
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(BgSoft),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = BluePrimary,
                modifier = Modifier.size(20.dp)
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = title,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = SlateSub,
                letterSpacing = 0.5.sp
            )
            Text(
                text = text,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = SlateText
            )
        }
    }
}